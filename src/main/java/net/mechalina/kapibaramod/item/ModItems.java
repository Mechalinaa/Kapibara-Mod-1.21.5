package net.mechalina.kapibaramod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.mechalina.kapibaramod.KapibaraMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item ORANGE_FRUIT=registerItem("orange_fruit",new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(KapibaraMod.MOD_ID,"orange_fruit")))));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(KapibaraMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        KapibaraMod.LOGGER.info("Registering Mod Items for "+KapibaraMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries ->{
            entries.add(ORANGE_FRUIT);
        });

    }
}
