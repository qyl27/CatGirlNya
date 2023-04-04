package cx.rain.mc.catgirlnya.data.gen.provider.base;

import cx.rain.mc.catgirlnya.item.tab.ModTabs;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.data.LanguageProvider;
import net.minecraftforge.registries.RegistryObject;

public abstract class LanguageProviderBase extends LanguageProvider {
    public LanguageProviderBase(PackOutput output, String modid, String locale) {
        super(output, modid, locale);
    }

    public void addTooltip(RegistryObject<? extends Item> item, int line, String tooltip) {
        addTooltip(item, line, "7", tooltip);
    }

    public void addTooltip(RegistryObject<? extends Item> item, int line, String colorCode, String tooltip) {
        String name = item.getId().getPath();
        add("tooltip." + name + "." + line, "§" + colorCode + tooltip);
    }

    public void addItemGroup(ResourceLocation location, String name) {
        add(ModTabs.makeTranslateKey(location), name);
    }
}
