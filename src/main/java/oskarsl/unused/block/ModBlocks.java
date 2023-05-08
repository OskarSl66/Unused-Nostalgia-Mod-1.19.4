package oskarsl.unused.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import oskarsl.unused.UnusedMod;
import oskarsl.unused.item.ModItemGroup;

public class ModBlocks {
    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
            new Block(FabricBlockSettings.of(Material.METAL).strength(4.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block RUBY_ORE = registerBlock("ruby_ore",
            new Block(FabricBlockSettings.of(Material.STONE).strength(4.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block WHITE_WOOD = registerBlock("white_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block RED_WOOD = registerBlock("red_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(1.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block ORANGE_WOOD = registerBlock("orange_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block YELLOW_WOOD = registerBlock("yellow_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block GREEN_WOOD = registerBlock("green_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block LIME_WOOD = registerBlock("lime_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block BLUE_WOOD = registerBlock("blue_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block LIGHT_BLUE_WOOD = registerBlock("light_blue_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block CYAN_WOOD = registerBlock("cyan_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block PURPLE_WOOD = registerBlock("purple_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block PINK_WOOD = registerBlock("pink_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block GREY_WOOD = registerBlock("grey_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block LIGHT_GREY_WOOD = registerBlock("light_grey_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);
    public static final Block BLACK_WOOD = registerBlock("black_wood",
            new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f).requiresTool()), ModItemGroup.UNUSED);




    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(UnusedMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(UnusedMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        UnusedMod.LOGGER.info("Registering Mod Blocks for " + UnusedMod.MOD_ID);
    }
}
