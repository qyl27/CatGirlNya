package cx.rain.mc.catgirlnya.item;

import cx.rain.mc.catgirlnya.group.ModItemGroups;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class ItemProgynovaBase extends Item {
    public ItemProgynovaBase() {
        super(new Properties()
                .setNoRepair()
                .defaultDurability(1)
                .durability(1)
                .tab(ModItemGroups.CAT_GIRL));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world,
                                List<Component> list, TooltipFlag flag) {
        super.appendHoverText(stack, world, list, flag);

        for (int i = 1; i <= 2; i++) {
            list.add(new TranslatableComponent("tooltip." + getRegistryName().getPath() + "." + i).withStyle(ChatFormatting.AQUA));
        }
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level world, Player player, InteractionHand hand) {
        var stack = player.getItemInHand(hand);
        stack.shrink(1);

        var emptyBox = new ItemStack(ModItems.PROGYNOVA.get());
        player.addItem(emptyBox);
        return super.use(world, player, hand);
    }
}
