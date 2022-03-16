package cx.rain.mc.catgirlnya.data.gen.provider;

import cx.rain.mc.catgirlnya.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider {

    public ModRecipeProvider(DataGenerator generator) {
        super(generator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {
        ShapelessRecipeBuilder.shapeless(ModItems.PRIDE_BANNER_PATTERN.get())
                .group("banner_pattern")
                .requires(Items.PAPER)
                .requires(Items.BLUE_DYE, 2)
                .requires(Items.RED_DYE, 2)
                .requires(Items.YELLOW_DYE)
                .unlockedBy("has_progynova", has(ModItems.PROGYNOVA.get()))
                .save(consumer);
    }
}
