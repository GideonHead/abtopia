package com.zepsun.abtopia.datagen;



import com.zepsun.abtopia.datagen.recipebuilders.SeedMakerRecipeBuilder;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        new SeedMakerRecipeBuilder(Items.CARROT, Items.WHEAT_SEEDS, 2)
                .unlockedBy("has_wheat", has(Items.WHEAT)).save(pWriter);

    }
}