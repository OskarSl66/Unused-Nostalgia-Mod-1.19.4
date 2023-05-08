package oskarsl.unused;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oskarsl.unused.block.ModBlocks;
import oskarsl.unused.item.ModItemGroup;
import oskarsl.unused.item.ModItems;

public class UnusedMod implements ModInitializer {
    public static final String MOD_ID = "unused-mod";
    public static final Logger LOGGER = LoggerFactory.getLogger("unused-mod");

    @Override
    public void onInitialize() {
        ModItemGroup.registerItemGroup();
        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
    }
}