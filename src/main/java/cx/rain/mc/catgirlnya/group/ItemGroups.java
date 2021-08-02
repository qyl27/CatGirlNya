package cx.rain.mc.catgirlnya.group;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class ItemGroups extends CreativeModeTab {
    private Item icon;

    public ItemGroups(String label, Item iconIn) {
        super(label);
        icon = iconIn;
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(icon);
    }
}
