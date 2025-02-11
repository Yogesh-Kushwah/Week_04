package org.example.personslizedmealplangenerator;

// Interface representing a meal plan
interface MealPlan {
    void displayMealDetails();
}

// Vegetarian meal implementation
class VegetarianMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("Vegetarian Meal: Includes fresh fruits, vegetables, grains, and dairy.");
    }
}

// Vegan meal implementation
class VeganMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("Vegan Meal: Includes plant-based foods such as vegetables, nuts, legumes, and seeds.");
    }
}

// Keto meal implementation
class KetoMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("Keto Meal: Includes high-fat, low-carb foods like meat, cheese, and avocado.");
    }
}

// High-Protein meal implementation
class HighProteinMeal implements MealPlan {
    @Override
    public void displayMealDetails() {
        System.out.println("High-Protein Meal: Includes foods like eggs, chicken, fish, and beans.");
    }
}

// Generic class to handle meal plans
class Meal<T extends MealPlan> {

    public void generateMealPlan(T mealPlan) {
        System.out.println("Generating your personalized meal plan...");
        mealPlan.displayMealDetails();
    }


}

// Main class for the Meal Plan Generator
public class PersonalizedMealPlanGenerator {

    // Generic method to validate and display meal plans directly


    public static void main(String[] args) {
        Meal<MealPlan> mealPlanMeal= new Meal<>();
        // Generate and display a vegetarian meal plan
        VegetarianMeal vegetarianMeal = new VegetarianMeal();
        mealPlanMeal.generateMealPlan(vegetarianMeal);

        System.out.println("--------------------------------------------");

        // Generate and display a vegan meal plan
        VeganMeal veganMeal = new VeganMeal();
        mealPlanMeal.generateMealPlan(veganMeal);

        System.out.println("--------------------------------------------");

        // Generate and display a keto meal plan
        KetoMeal ketoMeal = new KetoMeal();
        mealPlanMeal.generateMealPlan(ketoMeal);

        System.out.println("--------------------------------------------");

        // Generate and display a high-protein meal plan
        HighProteinMeal highProteinMeal = new HighProteinMeal();
        mealPlanMeal.generateMealPlan(highProteinMeal);
    }
}
