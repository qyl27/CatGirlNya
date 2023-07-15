package cx.rain.mc.catgirlnya.fabric.data;

import cx.rain.mc.catgirlnya.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

public class RecipeProvider extends FabricRecipeProvider {
    public RecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void buildRecipes(Consumer<FinishedRecipe> exporter) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.BLAHAJ.get())
                .pattern(" B ")
                .pattern("BBB")
                .pattern("PW ")
                .define('B', Items.LIGHT_BLUE_WOOL)
                .define('P', Items.PINK_DYE)
                .define('W', Items.WHITE_WOOL)
                .unlockedBy("got_wool", has(Items.WHITE_WOOL))
                .save(exporter);
    }
}
