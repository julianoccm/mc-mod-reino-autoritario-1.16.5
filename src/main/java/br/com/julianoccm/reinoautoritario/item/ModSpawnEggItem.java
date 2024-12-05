package br.com.julianoccm.reinoautoritario.item;

import net.minecraft.block.BlockState;
import net.minecraft.block.DispenserBlock;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.dispenser.IDispenseItemBehavior;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnReason;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.util.Direction;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.fml.RegistryObject;

import java.util.ArrayList;
import java.util.List;

public class ModSpawnEggItem extends SpawnEggItem {
    protected static final List<ModSpawnEggItem> UNADDED_EGGS = new ArrayList<>();
    private final Lazy<? extends EntityType<?>> entityTypeSupplier;

    public ModSpawnEggItem(final RegistryObject<? extends EntityType<?>> entityTypeSupplier, int primaryColorIn, int secondaryColorIn, Properties builder) {
        super(null, primaryColorIn, secondaryColorIn, builder);
        this.entityTypeSupplier = Lazy.of(entityTypeSupplier::get);
        UNADDED_EGGS.add(this);
    }

    public static void initSpawnEggs() {
        IDispenseItemBehavior  dispenseItemBehavior = new IDispenseItemBehavior() {
            @Override
            public ItemStack dispense(IBlockSource source, ItemStack stack) {
                BlockState blockState = source.getBlockState();
                Direction direction = blockState.getValue(DispenserBlock.FACING);
                EntityType<?> type = ((SpawnEggItem) stack.getItem()).getType(stack.getTag());

                type.spawn(source.getLevel(), stack, null, source.getPos(),
                        SpawnReason.DISPENSER, direction != Direction.UP, false);

                stack.shrink(1);
                return stack;
            }
        };

        for (final SpawnEggItem spawnEgg : UNADDED_EGGS) {
            DispenserBlock.registerBehavior(spawnEgg, dispenseItemBehavior);
        }

        UNADDED_EGGS.clear();
    }

    @Override
    public EntityType<?> getType(CompoundNBT nbt) {
        return this.entityTypeSupplier.get();
    }
}