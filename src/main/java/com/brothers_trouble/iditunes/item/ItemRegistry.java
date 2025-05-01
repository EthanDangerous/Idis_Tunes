package com.brothers_trouble.iditunes.item;

import com.brothers_trouble.iditunes.IdisTunes;
import com.brothers_trouble.iditunes.sound.SoundRegistry;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ItemRegistry {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IdisTunes.MODID);

    public static final DeferredHolder<Item, Item> FINITE_GEMSTONE_MUSIC_DISC = ITEMS.register("finite_gemstone_music_disc",
            () -> new Item(new Item.Properties().jukeboxPlayable(SoundRegistry.FINITE_GEMSTONE_KEY).stacksTo(1).rarity(Rarity.RARE)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
