package cx.rain.mc.catgirlnya.group;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ItemGroups extends CreativeModeTab {
    private RegistryObject<Item> icon;

    public ItemGroups(String label, RegistryObject<Item> iconIn) {
        super(label);
        icon = iconIn;
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(icon.get());
    }
}
