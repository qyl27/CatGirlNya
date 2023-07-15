package cx.rain.mc.catgirlnya.item;

import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;

public class ProxynevaItem extends Item {
    public ProxynevaItem() {
        super(new Properties()
                .stacksTo(16)
                .food(new FoodProperties.Builder().alwaysEat().build())
                .arch$tab(ModTabs.CAT_GIRL));
    }
}
