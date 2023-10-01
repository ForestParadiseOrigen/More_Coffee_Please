package com.codeparadise.morecoffeeplease.item;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {
    public static final ItemGroup COFFEE_GROUP = new ItemGroup("morecoffeepleasetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.COFFEE.get());
        }
    };
}
