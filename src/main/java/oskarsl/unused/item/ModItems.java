package oskarsl.unused.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import oskarsl.unused.UnusedMod;

public class ModItems {

    public static final Item RUBY = registerItem("ruby",
            new Item(new FabricItemSettings()));
    public static final Item HAT_RUBY = registerItem("hat_ruby",
            new Item(new FabricItemSettings()));
    public static final Item SHIRT_RUBY = registerItem("shirt_ruby",
            new Item(new FabricItemSettings()));
    public static final Item SHORTS_RUBY = registerItem("shorts_ruby",
            new Item(new FabricItemSettings()));
    public static final Item BOOTS_RUBY = registerItem("boots_ruby",
            new Item(new FabricItemSettings()));
    public static final Item STUDDED_HAT = registerItem("studded_hat",
            new Item(new FabricItemSettings()));
    public static final Item STUDDED_SHIRT = registerItem("studded_shirt",
            new Item(new FabricItemSettings()));
    public static final Item STUDDED_SHORTS = registerItem("studded_shorts",
            new Item(new FabricItemSettings()));
    public static final Item STUDDED_BOOTS = registerItem("studded_boots",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(UnusedMod.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ModItemGroup.UNUSED, RUBY);
        addToItemGroup(ModItemGroup.UNUSED, HAT_RUBY);
        addToItemGroup(ModItemGroup.UNUSED, SHIRT_RUBY);
        addToItemGroup(ModItemGroup.UNUSED, SHORTS_RUBY);
        addToItemGroup(ModItemGroup.UNUSED, BOOTS_RUBY);
        addToItemGroup(ModItemGroup.UNUSED, STUDDED_HAT);
        addToItemGroup(ModItemGroup.UNUSED, STUDDED_SHIRT);
        addToItemGroup(ModItemGroup.UNUSED, STUDDED_SHORTS);
        addToItemGroup(ModItemGroup.UNUSED, STUDDED_BOOTS);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        UnusedMod.LOGGER.info("Registering Mod Items for " + UnusedMod.MOD_ID);

        addItemsToItemGroup();
    }



}
