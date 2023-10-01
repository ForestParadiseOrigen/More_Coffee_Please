package com.codeparadise.morecoffeeplease.item;

import com.codeparadise.morecoffeeplease.MoreCoffeePlease;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
// import net.minecraft.item.ItemGroup;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
// import net.minecraftforge.event.entity.item.ItemEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreCoffeePlease.MOD_ID);

    // Hot coffee
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",
            () -> new Item(new Item.Properties()
                    .tab(ModItemGroup.COFFEE_GROUP)
                    .stacksTo(1)
            )
    );

    // Hot coffee
    public static final RegistryObject<Item> HOT_COFFEE = ITEMS.register("hot_coffee",
            () -> new Item(new Item.Properties()
                    .tab(ModItemGroup.COFFEE_GROUP)
                    .food(new Food.Builder()
                            .nutrition(4)
                            .saturationMod(2)
                            .alwaysEat()
                            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 200, 0), 1.0F)
                            .build()

                    )
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
