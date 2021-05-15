package io.github.fallOut015.dreamcatchers.block;

import io.netty.util.internal.shaded.org.jctools.queues.MessagePassingQueue;
import net.minecraft.block.*;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.loot.LootParameterSets;
import net.minecraft.loot.LootParameters;
import net.minecraft.loot.LootTable;
import net.minecraft.particles.IParticleData;
import net.minecraft.server.MinecraftServer;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.event.entity.player.PlayerWakeUpEvent;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class DreamcatcherBlock extends Block {
    public static final DirectionProperty FACING = HorizontalBlock.FACING;
    protected static final VoxelShape DREAMCATCHER_EAST_AABB = Block.box(0.0D, 0.0D, 0.0D, 3.0D, 16.0D, 16.0D);
    protected static final VoxelShape DREAMCATCHER_WEST_AABB = Block.box(13.0D, 0.0D, 0.0D, 16.0D, 16.0D, 16.0D);
    protected static final VoxelShape DREAMCATCHER_SOUTH_AABB = Block.box(0.0D, 0.0D, 0.0D, 16.0D, 16.0D, 3.0D);
    protected static final VoxelShape DREAMCATCHER_NORTH_AABB = Block.box(0.0D, 0.0D, 13.0D, 16.0D, 16.0D, 16.0D);
    private final LazyValue<IParticleData> particle;
    private final MessagePassingQueue.Consumer<PlayerWakeUpEvent> effect;

    public DreamcatcherBlock(Properties properties, Supplier<IParticleData> particle, MessagePassingQueue.Consumer<PlayerWakeUpEvent> effect) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));
        this.particle = new LazyValue<>(particle);
        this.effect = effect;
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        switch((Direction) state.getValue(FACING)) {
            case NORTH:
                return DREAMCATCHER_NORTH_AABB;
            case SOUTH:
                return DREAMCATCHER_SOUTH_AABB;
            case WEST:
                return DREAMCATCHER_WEST_AABB;
            case EAST:
            default:
                return DREAMCATCHER_EAST_AABB;
        }
    }
    private boolean canAttachTo(IBlockReader blockReader, BlockPos blockPos, Direction direction) {
        BlockState blockstate = blockReader.getBlockState(blockPos);
        return blockstate.isFaceSturdy(blockReader, blockPos, direction);
    }
    public boolean canSurvive(BlockState state, IWorldReader worldIn, BlockPos pos) {
        Direction direction = state.getValue(FACING);
        return this.canAttachTo(worldIn, pos.relative(direction.getOpposite()), direction);
    }
    @SuppressWarnings("deprecation")
    public BlockState updateShape(BlockState stateIn, Direction facing, BlockState facingState, IWorld worldIn, BlockPos currentPos, BlockPos facingPos) {
        if (facing.getOpposite() == stateIn.getValue(FACING) && !stateIn.canSurvive(worldIn, currentPos)) {
            return Blocks.AIR.defaultBlockState();
        } else {
            return super.updateShape(stateIn, facing, facingState, worldIn, currentPos, facingPos);
        }
    }
    @Nullable
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        if (!context.replacingClickedOnBlock()) {
            BlockState blockstate = context.getLevel().getBlockState(context.getClickedPos().relative(context.getClickedFace().getOpposite()));
            if (blockstate.getBlock() == this && blockstate.getValue(FACING) == context.getClickedFace())
                return null;
        }

        BlockState blockstate1 = this.defaultBlockState();

        for(Direction direction : context.getNearestLookingDirections())
            if (direction.getAxis().isHorizontal())
                if((blockstate1 = blockstate1.setValue(FACING, direction.getOpposite())).canSurvive(context.getLevel(), context.getClickedPos()))
                    return blockstate1;

        return null;
    }
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }
    @SuppressWarnings("deprecation")
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    public static void chaotic(PlayerWakeUpEvent playerWakeUpEvent) { }
    public static void cloudy(PlayerWakeUpEvent playerWakeUpEvent) {
//		BlockState bedstate = playerWakeUpEvent.getPlayer().getEntityWorld().getBlockState(playerWakeUpEvent.getPlayer().getBedPosition().get());
//		playerWakeUpEvent.getPlayer().changeDimension(DimensionTypeTwo.SKY, new ITeleporter() {
//			public Entity placeEntity(Entity entity, ServerWorld currentWorld, ServerWorld destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
//				return repositionEntity.apply(false);
//			}
//		});
//		playerWakeUpEvent.getPlayer().sendStatusMessage(new TranslationTextComponent("block.minecraft.bed.sky"), true);
//		playerWakeUpEvent.getPlayer().getEntityWorld().setBlockState(playerWakeUpEvent.getPlayer().getPosition(), bedstate);
//		playerWakeUpEvent.getPlayer().getEntityWorld().setDayTime(13000);
        // TODO blah blah blah
    }
    public static void colorful(PlayerWakeUpEvent playerWakeUpEvent) { }
    public static void fortuitous(PlayerWakeUpEvent playerWakeUpEvent) {
        if(playerWakeUpEvent.getPlayer().level instanceof ServerWorld && playerWakeUpEvent.getPlayer().level.getServer() != null) {
            LootContext.Builder lootcontext$builder = (new LootContext.Builder((ServerWorld) playerWakeUpEvent.getPlayer().level)).withRandom(playerWakeUpEvent.getPlayer().level.getRandom()).withLuck(1).withParameter(LootParameters.ORIGIN, playerWakeUpEvent.getPlayer().position()).withParameter(LootParameters.THIS_ENTITY, playerWakeUpEvent.getEntity());
            LootTable loottable = playerWakeUpEvent.getPlayer().level.getServer().getLootTables().get(new ResourceLocation("dreamcatchers", "gameplay/fortuitous_dreamcatcher"));
            List<ItemStack> list = loottable.getRandomItems(lootcontext$builder.create(LootParameterSets.GIFT));

            playerWakeUpEvent.getPlayer().level.addFreshEntity(new ItemEntity(playerWakeUpEvent.getPlayer().level, playerWakeUpEvent.getPlayer().xOld, playerWakeUpEvent.getPlayer().yOld + 0.5, playerWakeUpEvent.getPlayer().zOld, list.get(playerWakeUpEvent.getPlayer().level.getRandom().nextInt(list.size()))));
        }
    }
    public static void lucky(PlayerWakeUpEvent playerWakeUpEvent) { }
    public static void mischievous(PlayerWakeUpEvent playerWakeUpEvent) {
        int roll = playerWakeUpEvent.getPlayer().level.getRandom().nextInt(10);
    }
    public static void nightmarish(PlayerWakeUpEvent playerWakeUpEvent) {
        if(playerWakeUpEvent.getPlayer().level instanceof ServerWorld) {
            ServerWorld serverworld = (ServerWorld) playerWakeUpEvent.getPlayer().level;
            MinecraftServer minecraftserver = serverworld.getServer();
            RegistryKey<World> registrykey = playerWakeUpEvent.getPlayer().level.dimension() == World.NETHER ? World.OVERWORLD : World.NETHER;
            ServerWorld serverworld1 = minecraftserver.getLevel(registrykey);
            if(serverworld1 != null && minecraftserver.isNetherEnabled() && !playerWakeUpEvent.getPlayer().isPassenger()) {
                playerWakeUpEvent.getPlayer().level.getProfiler().push("portal");
                playerWakeUpEvent.getPlayer().changeDimension(serverworld1);
                playerWakeUpEvent.getPlayer().level.getProfiler().pop();
            }
        }






//		BlockState bedstate = playerWakeUpEvent.getPlayer().getEntityWorld().getBlockState(playerWakeUpEvent.getPlayer().getBedPosition().get());
        //Block bed = bedstate.getBlock();
//		IWorldReader worldreader = playerWakeUpEvent.getPlayer().getEntityWorld();
//		BlockPos blockpos = playerWakeUpEvent.getPlayer().getBedPosition().get();

//		ServerWorld serverworld = (ServerWorld) playerWakeUpEvent.getPlayer().world;
//		MinecraftServer minecraftserver = serverworld.getServer();
//		ServerWorld dim = minecraftserver.getWorld(WorldTwo.NIGHTMARE);
//		playerWakeUpEvent.getPlayer().changeDimension(dim, new ITeleporter() {
//			public Entity placeEntity(Entity entity, ServerWorld currentWorld, ServerWorld destWorld, float yaw, Function<Boolean, Entity> repositionEntity) {
//				return repositionEntity.apply(false);
//			}
//		});

//		bedstate.getBlock().setBedOccupied(bedstate, worldreader, blockpos, playerWakeUpEvent.getEntityLiving(), false);
//		playerWakeUpEvent.getPlayer().sendStatusMessage(new TranslationTextComponent("block.minecraft.bed.nightmare"), true);
//		// Somewhere I need to make a manager for the inventories, probably in the ModDimension classes.
//		// I also need to spawn a bed in the dimension that lets you wake back up.
//		playerWakeUpEvent.getPlayer().getEntityWorld().setBlockState(playerWakeUpEvent.getPlayer().getPosition(), bedstate);
//		// foot of bed
//		playerWakeUpEvent.getPlayer().getEntityWorld().setDayTime(13000);
        // TODO you get it
    }
    public static void rejuvenating(PlayerWakeUpEvent playerWakeUpEvent) {
        if(playerWakeUpEvent.getPlayer().getHealth() < 20) {
            playerWakeUpEvent.getPlayer().setHealth(20);
        }
    }

    @Override
    public void animateTick(BlockState stateIn, World worldIn, BlockPos pos, Random rand) {
        // TODO check dimension

        if(worldIn.getDayTime() > 13000 && worldIn.getDayTime() < 23500) {
            double x = 0, z = 0;
            double y = MathHelper.lerp(rand.nextInt(2), (double)pos.getY(), (double)pos.getY() + 1);

            if(stateIn.getValue(FACING).equals(Direction.NORTH)) {
                x = MathHelper.lerp(rand.nextInt(2), (double)pos.getX(), (double)pos.getX() + 1);
                z = pos.getZ() + 0.8125;
            } else if(stateIn.getValue(FACING).equals(Direction.EAST)) {
                x = pos.getX() + 0.1875;
                z = MathHelper.lerp(rand.nextInt(2), (double)pos.getZ(), (double)pos.getZ() + 1);
            } else if(stateIn.getValue(FACING).equals(Direction.SOUTH)) {
                x = MathHelper.lerp(rand.nextInt(2), (double)pos.getX(), (double)pos.getX() + 1);
                z = pos.getZ() + 0.1875;
            } else if(stateIn.getValue(FACING).equals(Direction.WEST)) {
                x = pos.getX() + 0.8125;
                z = MathHelper.lerp(rand.nextInt(2), (double)pos.getZ(), (double)pos.getZ() + 1);
            }

            worldIn.addParticle(this.particle.get(), x, y, z, 0.0D, 0.0D, 0.0D);
        }
    }

    public void onPlayerWakeUp(PlayerWakeUpEvent playerWakeUpEvent) {
        this.effect.accept(playerWakeUpEvent);
    }
}