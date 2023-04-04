package cx.rain.mc.catgirlnya.data.gen.provider.base;

import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class ItemModelProviderBase extends ItemModelProvider {
    public ItemModelProviderBase(PackOutput output, String modid, ExistingFileHelper existingFileHelper) {
        super(output, modid, existingFileHelper);
    }

    private ModelFile getModel(String loc) {
        return new ModelFile.UncheckedModelFile(new ResourceLocation(modid, loc));
    }

    protected void simpleItem(Item item, ResourceLocation texture) {
        singleTexture(locFromItem(item).getPath(), mcLoc("generated"), "layer0", texture);
    }

    protected void simpleItem(Item item) {
        simpleItem(item, modLoc("assets/catgirlnya/models/item/" + locFromItem(item).getPath()));
    }

    protected void simpleBlockItem(BlockItem blockItem) {
        var path = locFromItem(blockItem).getPath();
        getBuilder(path).parent(getModel("block/" + path));
    }

    protected ResourceLocation locFromItem(Item item) {
        return ForgeRegistries.ITEMS.getKey(item);
    }
}
