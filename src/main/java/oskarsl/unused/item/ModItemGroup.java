package oskarsl.unused.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import oskarsl.unused.UnusedMod;

public class ModItemGroup {
    public static ItemGroup UNUSED;

    public static void registerItemGroup() {
        UNUSED = FabricItemGroup.builder(new Identifier(UnusedMod.MOD_ID, "ruby"))
                .displayName(Text.literal("Unused"))
                .icon(() -> new ItemStack(ModItems.RUBY)).build();
    }

}
