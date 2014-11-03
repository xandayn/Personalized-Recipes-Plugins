package common.xandayn.personalizedrecipes_plugins;

import common.xandayn.personalrecipes.plugin.annotation.PersonalizedRecipesPlugin;
import common.xandayn.personalrecipes.recipe.RecipeRegistry;

@PersonalizedRecipesPlugin
public class TestPlugin {

    @PersonalizedRecipesPlugin.Instance
    private static TestPlugin INSTANCE;

    @PersonalizedRecipesPlugin.Initialize
    public void initialize(RecipeRegistry recipeRegistry){
        recipeRegistry.registerRecipeHandler(null);
    }

}
