package br.com.julianoccm.reinoautoritario.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup REINO_AUTORITARIO_PIXELMON = new ItemGroup("reinoAutoritarioPixelmon") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CROWN_POKEBALL.get());
        }
    };

    public static final ItemGroup REINO_AUTORITARIO_MOBS = new ItemGroup("reinoAutoritarioEggs") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CROWN_EGG.get());
        }
    };
}
