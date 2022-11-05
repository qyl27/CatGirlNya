package cx.rain.mc.catgirlnya.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.registries.RegistryObject;

public class ModGroups extends CreativeModeTab {
    public static final CreativeModeTab CAT_GIRL = new ModGroups("cat_girl", ModItems.PROXYNEVA);

    private RegistryObject<Item> icon;

    public ModGroups(String label, RegistryObject<Item> iconIn) {
        super(label);
        icon = iconIn;
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(icon.get());
    }
}
