package Exercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        NutritionPlanDirector director = new NutritionPlanDirector();
        NutritionPlanBuilder builder = new WeightLossNutritionPlanBuilder();

        director.setBuilder(builder);
        NutritionPlan plan = director.createNutritionPlan();

        builder.setCaloricIntake(2000)
                .setMacronutrientRatios(40, 30, 30)
                .setMealPlans(List.of("Breakfast: Oatmeal", "Lunch: Chicken Salad"))
                .setDietaryRestrictions(List.of("gluten-free"));

        System.out.println(plan);
    }
}
