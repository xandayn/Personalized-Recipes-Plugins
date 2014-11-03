package common.xandayn.personalizedrecipes_plugins;

import common.xandayn.personalizedrecipes_plugins.recipe.TestRecipeHandler;
import common.xandayn.personalrecipes.plugin.annotation.PersonalizedRecipesPlugin;
import common.xandayn.personalrecipes.recipe.RecipeRegistry;

@PersonalizedRecipesPlugin
public class TestPlugin {

    @PersonalizedRecipesPlugin.Instance
    private static TestPlugin INSTANCE;

    @PersonalizedRecipesPlugin.Initialize
    public void initialize(){
        System.out.println("Testing");
        RecipeRegistry.INSTANCE.registerRecipeHandler(new TestRecipeHandler());
    }

}
