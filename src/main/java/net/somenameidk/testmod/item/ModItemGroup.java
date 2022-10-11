package net.somenameidk.testmod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.somenameidk.testmod.TestMod;

public class ModItemGroup {
    public static final ItemGroup TESTMOD = FabricItemGroupBuilder.build(
            new Identifier(TestMod.MOD_ID, "testmod"), () -> new ItemStack(ItemsClass.BALL));
}
