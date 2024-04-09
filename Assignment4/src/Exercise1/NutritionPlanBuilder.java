package Exercise1;

import java.util.List;

public class NutritionPlanBuilder {
    private final NutritionPlan plan;

    public NutritionPlanBuilder() {
        this.plan = new NutritionPlan();
    }

    public NutritionPlanBuilder setCaloricIntake(int caloricIntake) {
        plan.dailyCaloricIntake = caloricIntake;
        return this;
    }

    public NutritionPlanBuilder setMacronutrientRatios(int carbs, int proteins, int fats) {
        plan.carbohydrates = carbs;
        plan.proteins = proteins;
        plan.fats = fats;
        return this;
    }

    public NutritionPlanBuilder setMealPlans(List<String> mealPlans) {
        plan.mealPlans = mealPlans;
        return this;
    }

    public NutritionPlanBuilder setFitnessGoal(String fitnessGoal) {
        plan.fitnessGoal = fitnessGoal;
        return this;
    }

    public NutritionPlanBuilder setDietaryRestrictions(List<String> dietaryRestrictions) {
        plan.dietaryRestrictions = dietaryRestrictions;
        return this;
    }

    public NutritionPlan build() {
        return plan;
    }
}

