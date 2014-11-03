package common.xandayn.personalizedrecipes_plugins.recipe;

import common.xandayn.personalizedrecipes_plugins.client.gui.recipe.TestRecipeGUIComponent;
import common.xandayn.personalrecipes.recipe.CustomRecipeHandler;
import common.xandayn.personalrecipes.recipe.data.RecipeData;

import java.util.ArrayList;

public class TestRecipeHandler extends CustomRecipeHandler {

    public TestRecipeHandler() {
        super(new TestRecipeGUIComponent());
    }

    @Override
    public String getID() {
        return "Plugin Test";
    }

    @Override
    public void registerRecipe(RecipeData recipeData) {
        System.out.println(recipeData);
    }

    @Override
    public void deleteRecipe(int position) {

    }

    @Override
    public ArrayList getRecipes() {
        return null;
    }

    @Override
    public int getRecipeCount() {
        return 0;
    }
}
