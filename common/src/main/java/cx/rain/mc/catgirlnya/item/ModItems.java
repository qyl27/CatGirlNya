package cx.rain.mc.catgirlnya.item;

import cx.rain.mc.catgirlnya.CatGirlNya;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.Item;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(CatGirlNya.MODID, Registries.ITEM);

    public static void register() {
        ITEMS.register();
    }

    public static final RegistrySupplier<Item> BLAHAJ = ITEMS.register("blahaj", BlahajItem::new);
}
