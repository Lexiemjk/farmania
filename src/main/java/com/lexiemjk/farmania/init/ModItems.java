package com.lexiemjk.farmania.init;

import com.lexiemjk.farmania.FarmaniaMain;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FarmaniaMain.MODID);

    public static final RegistryObject<Item> DIAMOND_APPLE = ITEMS.register("diamond_apple", () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD)));
    public static final RegistryObject<Item> DIAMOND_SEED = ITEMS.register("diamond_seed", () -> new Item(new Item.Properties().stacksTo(16).tab(ItemGroup.TAB_FOOD)));
}
