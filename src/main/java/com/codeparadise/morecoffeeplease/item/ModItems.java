package com.codeparadise.morecoffeeplease.item;

import com.codeparadise.morecoffeeplease.MoreCoffeePlease;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MoreCoffeePlease.MOD_ID);

    // Normal coffee
    public static final RegistryObject<Item> COFFEE = ITEMS.register("coffee",
            () -> new Item(new Item.Properties()
                    .tab(ModItemGroup.COFFEE_GROUP)
                    .stacksTo(1)
                    .food(new Food.Builder()
                            .nutrition(4)
                            .saturationMod(2)
                            .alwaysEat()
                            .effect(new EffectInstance(Effects.MOVEMENT_SPEED,1200,0),1.0F)
                            .build()
                    )
            )
    );

    // Hot coffee
    public static final RegistryObject<Item> HOT_COFFEE = ITEMS.register("hot_coffee",
            () -> new Item(new Item.Properties()
                    .tab(ModItemGroup.COFFEE_GROUP)
                    .stacksTo(1)
                    .food(new Food.Builder()
                            .nutrition(4)
                            .saturationMod(2)
                            .alwaysEat()
                            .effect(new EffectInstance(Effects.FIRE_RESISTANCE, 1200, 0), 1.0F)
                            .effect(new EffectInstance(Effects.MOVEMENT_SPEED,1200,0),1.0F)
                            .build()
                    )
            )
    );

    // Miner coffee
    public static final RegistryObject<Item> MINER_COFFEE = ITEMS.register("miner_coffee",
            () -> new Item(new Item.Properties()
                    .tab(ModItemGroup.COFFEE_GROUP)
                    .stacksTo(1)
                    .food(new Food.Builder()
                            .nutrition(4)
                            .saturationMod(2)
                            .alwaysEat()
                            .effect(new EffectInstance(Effects.DIG_SPEED,1200,1),1.0F)
                            .effect(new EffectInstance(Effects.MOVEMENT_SPEED,1200,0),1.0F)
                            .build()
                    )
            )
    );

    // Sea coffee
    public static final RegistryObject<Item> SEA_COFFEE = ITEMS.register("sea_coffee",
            () -> new Item(new Item.Properties()
                    .tab(ModItemGroup.COFFEE_GROUP)
                    .stacksTo(1)
                    .food(new Food.Builder()
                            .nutrition(4)
                            .saturationMod(2)
                            .alwaysEat()
                            .effect(new EffectInstance(Effects.WATER_BREATHING, 3500,0),1.0F)
                            .effect(new EffectInstance(Effects.NIGHT_VISION, 3000,0),1.0F)
                            .effect(new EffectInstance(Effects.MOVEMENT_SPEED,3000,2),1.0F)
                            .build()
                    )
            )
    );

    // Lucky coffee
    public static final RegistryObject<Item> LUCKY_COFFEE = ITEMS.register("lucky_coffee",
            () -> new Item(new Item.Properties()
                    .tab(ModItemGroup.COFFEE_GROUP)
                    .stacksTo(1)
                    .food(new Food.Builder()
                            .nutrition(4)
                            .saturationMod(2)
                            .alwaysEat()
                            .effect(new EffectInstance(Effects.LUCK, 3000,4),1.0F)
                            .effect(new EffectInstance(Effects.MOVEMENT_SPEED,3000,2),1.0F)
                            .build()
                    )
            )
    );

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
