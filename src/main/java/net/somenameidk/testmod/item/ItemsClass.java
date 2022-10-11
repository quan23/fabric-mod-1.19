package net.somenameidk.testmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.somenameidk.testmod.TestMod;


public class ItemsClass {
    public static Item BALL = registerItems("ball",
            new Item(new FabricItemSettings().group(ItemGroup.COMBAT)));

    private static Item registerItems(String name,Item item){
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TestMod.LOGGER.info("got " + TestMod.MOD_ID + " to run!");
    }
}
