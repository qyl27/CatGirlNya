package cx.rain.mc.catgirlnya.item;

import cx.rain.mc.catgirlnya.Constants;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import org.jetbrains.annotations.Nullable;

import java.time.Instant;
import java.time.ZoneId;
import java.util.List;

public class BlahajItem extends Item {
    public BlahajItem() {
        super(new Properties().stacksTo(1).arch$tab(ModTabs.CAT_GIRL));
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltipComponents, TooltipFlag isAdvanced) {
        super.appendHoverText(stack, level, tooltipComponents, isAdvanced);

        if (stack.hasTag()) {
            if (stack.hasCustomHoverName()) {
                tooltipComponents.add(getOwner(stack));
            }

            tooltipComponents.add(getCraftBy(stack));
            tooltipComponents.add(getCraftAt(stack));
        }
    }

    @Override
    public void onCraftedBy(ItemStack stack, Level level, Player player) {
        if (player != null) {
            setCraftBy(stack, player);
        }

        super.onCraftedBy(stack, level, player);
    }

    @Override
    public float getDestroySpeed(ItemStack stack, BlockState state) {
        return 0.25f;
    }

//    @Override
//    public UseAnim getUseAnimation(ItemStack stack) {
//        return UseAnim.CROSSBOW;
//    }

    /// <editor-fold desc="Custom name and craft.">

    public static final String TAG_CRAFT_BY_NAME = "craftedBy";
    public static final String TAG_CRAFT_AT_NAME = "craftedAt";
    public static final String TAG_CRAFT_BY_UUID_NAME = "craftedByUuid";
    public static final String TAG_OWNER_NAME = "owner";
    public static final String TAG_OWNER_UUID_NAME = "ownerUuid";

    private void setCraftBy(ItemStack stack, Player player) {
        var tag = stack.getOrCreateTag();
        tag.putString(TAG_CRAFT_BY_NAME, player.getName().getString());
        tag.putLong(TAG_CRAFT_AT_NAME, Instant.now().getEpochSecond());
        tag.putUUID(TAG_CRAFT_BY_UUID_NAME, player.getUUID());
        stack.setTag(tag);
    }

    public static Component getCraftBy(ItemStack stack) {
        var name = stack.getTag().getString(TAG_CRAFT_BY_NAME);
        return Component.translatable(Constants.TRANSLATE_TOOLTIP_CRAFTED_BY, name);
    }

    public static Component getCraftAt(ItemStack stack) {
        var timestamp = stack.getTag().getLong(TAG_CRAFT_AT_NAME);
        var time = Instant.ofEpochSecond(timestamp).atZone(ZoneId.systemDefault());
        return Component.translatable(Constants.TRANSLATE_TOOLTIP_CRAFTED_AT,
                time.getYear(), time.getMonth().getValue(), time.getDayOfMonth(),
                time.getHour(), time.getMinute(), time.getSecond());
    }

    public static void setOwner(ItemStack stack, Player player) {
        var tag = stack.getOrCreateTag();
        tag.putString(TAG_OWNER_NAME, player.getName().getString());
        tag.putUUID(TAG_OWNER_UUID_NAME, player.getUUID());
        stack.setTag(tag);
    }

    public static Component getOwner(ItemStack stack) {
        var name = stack.getTag().getString(TAG_OWNER_NAME);
        return Component.translatable(Constants.TRANSLATE_TOOLTIP_OWNER, name, stack.getHoverName());
    }

    /// </editor-fold>
}
