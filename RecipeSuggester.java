import java.util.*;

public class RecipeSuggester {
    private Map<String, List<String>> recipeDatabase = new HashMap<>();


    recipeDatabase.put("tomato, cheese, bread", Arrays.asList("Pizza", "Grilled Cheese Sandwich"));
    recipeDatabase.put("chicken, rice, spices", Arrays.asList("Chicken Biryani", "Spicy Chicken Rice"));
    recipeDatabase.put("egg, flour, milk", Arrays.asList("Pancakes", "Omelette"));

    public static List<String> getDishes(String ingredients) {
        for (String key : recipeDatabase.keySet()) {
            if (key.contains(ingredients.toLowerCase())) {
                return recipeDatabase.get(key);
            }
        }
        return Arrays.asList("No matching dishes found. Try different ingredients!");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter ingredients separated by commas:");
        String userIngredients = scanner.nextLine();

        List<String> suggestedDishes = getDishes(userIngredients);
        System.out.println("Suggested dishes:");
        suggestedDishes.forEach(System.out::println);

        scanner.close();
    }
}

