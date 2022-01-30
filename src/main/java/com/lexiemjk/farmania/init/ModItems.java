package com.lexiemjk.farmania.init;

import com.lexiemjk.farmania.FarmaniaMain;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, FarmaniaMain.MODID);

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

    public static final RegistryObject<Item> STRANGE_SEED = ITEMS.register("strange_seed", () -> new Item(new Item.Properties().group(ModItemGroup.FARMANIA).maxStackSize(16)));

}
