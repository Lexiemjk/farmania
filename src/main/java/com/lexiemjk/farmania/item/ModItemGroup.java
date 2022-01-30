package com.lexiemjk.farmania.item;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup FARMANIA_GROUP = new ItemGroup("farmaniaGroup") {
        @Override
        public ItemStack createIcon(){
            return new ItemStack(ModItems.STRANGE_SEED.get());
        }
    };
}
