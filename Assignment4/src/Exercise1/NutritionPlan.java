package Exercise1;

import java.util.List;

public class NutritionPlan {
    int dailyCaloricIntake;
    int carbohydrates;
    int proteins;
    int fats;
    List<String> mealPlans;
    String fitnessGoal;
    List<String> dietaryRestrictions;
    public NutritionPlan() {
    }

    @Override
    public String toString() {
        return "NutritionPlan{" +
                "dailyCaloricIntake=" + dailyCaloricIntake +
                ", carbohydrates=" + carbohydrates +
                ", proteins=" + proteins +
                ", fats=" + fats +
                ", mealPlans=" + mealPlans +
                ", fitnessGoal='" + fitnessGoal + '\'' +
                ", dietaryRestrictions=" + dietaryRestrictions +
                '}';
    }
}
