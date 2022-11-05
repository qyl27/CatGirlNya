package cx.rain.mc.catgirlnya.data.gen.provider.base;

import net.minecraft.data.DataGenerator;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public abstract class LanguageProviderBase extends LanguageProvider {
    public LanguageProviderBase(DataGenerator gen, String modid, String locale) {
        super(gen, modid, locale);
    }

    public void addItemGroup(CreativeModeTab group, String name) {
        add(group.langId, name);
    }

    public void addTooltip(RegistryObject<? extends Item> item, int line, String tooltip) {
        addTooltip(item, line, "7", tooltip);
    }

    public void addTooltip(RegistryObject<? extends Item> item, int line, String colorCode, String tooltip) {
        String name = item.getId().getPath();
        add("tooltip." + name + "." + line, "§" + colorCode + tooltip);
    }
}
