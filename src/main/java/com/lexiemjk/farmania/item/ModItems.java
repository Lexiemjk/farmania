package com.lexiemjk.farmania.item;

import com.lexiemjk.farmania.FarmaniaMain;
import com.lexiemjk.farmania.block.ModBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FarmaniaMain.MODID);

    public static final RegistryObject<Item> STRANGE_SEED = ITEMS.register("strange_seed",
            () -> new Item(new Item.Properties().group(ModItemGroup.FARMANIA_GROUP).maxStackSize(16)));

    public static final RegistryObject<Item> MAGICAL_WHEAT = ITEMS.register("magical_wheat",
            () -> new BlockItem(ModBlocks.MAGICAL_WHEAT.get(), new Item.Properties().group(ModItemGroup.FARMANIA_GROUP)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
