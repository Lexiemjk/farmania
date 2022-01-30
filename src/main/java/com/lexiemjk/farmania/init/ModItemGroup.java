package com.lexiemjk.farmania.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup FARMANIA = new ItemGroup("farmania") {
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModItems.STRANGE_SEED.get());
        }
    };
}
