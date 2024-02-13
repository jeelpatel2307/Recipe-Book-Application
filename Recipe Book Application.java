class Recipe:
    def __init__(self, name, ingredients, instructions):
        self.name = name
        self.ingredients = ingredients
        self.instructions = instructions

    def display_recipe(self):
        print(f"Recipe: {self.name}")
        print("Ingredients:")
        for ingredient in self.ingredients:
            print(f"- {ingredient}")
        print("Instructions:")
        for idx, instruction in enumerate(self.instructions, start=1):
            print(f"{idx}. {instruction}")
        print()


class RecipeBook:
    def __init__(self):
        self.recipes = []

    def add_recipe(self, recipe):
        self.recipes.append(recipe)

    def display_all_recipes(self):
        if not self.recipes:
            print("No recipes found.")
            return
        print("All Recipes:")
        for recipe in self.recipes:
            recipe.display_recipe()


def main():
    recipe1 = Recipe("Pasta Carbonara",
                     ["Spaghetti", "Eggs", "Bacon", "Parmesan cheese", "Black pepper"],
                     ["Cook spaghetti according to package instructions.",
                      "Fry bacon until crispy, then chop into bits.",
                      "Whisk eggs with grated Parmesan cheese.",
                      "Mix cooked spaghetti with egg mixture and bacon bits.",
                      "Serve hot with freshly ground black pepper."])

    recipe2 = Recipe("Chocolate Chip Cookies",
                     ["All-purpose flour", "Butter", "Brown sugar", "White sugar", "Eggs", "Vanilla extract",
                      "Baking soda", "Salt", "Chocolate chips"],
                     ["Preheat oven to 350°F (175°C).",
                      "Cream together butter, brown sugar, and white sugar.",
                      "Beat in eggs one at a time, then stir in vanilla.",
                      "Combine flour, baking soda, and salt; gradually add to the creamed mixture.",
                      "Stir in chocolate chips.",
                      "Drop dough by teaspoonfuls onto ungreased cookie sheets.",
                      "Bake for 8 to 10 minutes in the preheated oven."])

    recipe_book = RecipeBook()
    recipe_book.add_recipe(recipe1)
    recipe_book.add_recipe(recipe2)

    recipe_book.display_all_recipes()


if __name__ == "__main__":
    main()
