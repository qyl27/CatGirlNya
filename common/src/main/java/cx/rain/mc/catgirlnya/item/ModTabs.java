package cx.rain.mc.catgirlnya.item;

import cx.rain.mc.catgirlnya.CatGirlNya;
import cx.rain.mc.catgirlnya.Constants;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModTabs {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(CatGirlNya.MODID, Registries.CREATIVE_MODE_TAB);

    public static void register() {
        TABS.register();
    }

    public static final RegistrySupplier<CreativeModeTab> CAT_GIRL = TABS.register("catgirlnya", () -> CreativeTabRegistry.create(Component.translatable(Constants.TRANSLATE_TAB_CAT_GIRL), () -> new ItemStack(ModItems.BLAHAJ.get())));
}
