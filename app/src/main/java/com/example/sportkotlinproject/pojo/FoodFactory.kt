package com.example.sportkotlinproject.pojo

import com.example.sportkotlinproject.R


object FoodFactory {
    private var foodGroup: FoodGroup? = null

    fun createFoodGroup(nameFoodGroup: String): FoodGroup? {
        if (nameFoodGroup == "Vegetables"){
            val name = "Vegetables"
            val img = R.drawable.ic_food_group_vegetables

            val carrot = Dish("Carrot")
            val broccoli = Dish("Broccoli")
            val asparagus = Dish("Asparagus")
            val corn = Dish("Corn")
            val cucumber = Dish("Cucumber")
            val eggplant = Dish("Eggplant")
            val pepper = Dish("Pepper")
            val mushrooms = Dish("Mushrooms")
            val potato = Dish("Potato")
            val tomato = Dish("Tomato")
            val peas = Dish("Peas")
            val cabbage = Dish("Cabbage")
            val list: List<Dish> = mutableListOf(carrot, broccoli, asparagus, corn, cucumber, eggplant, pepper,
            mushrooms, potato, tomato, peas, cabbage)
            foodGroup = FoodGroup(name, img, list)
        }
        if(nameFoodGroup == "Fruits"){
            val name = "Fruits"
            val img = R.drawable.ic_food_group_fruits

            val apple = Dish("Apple")
            val banana = Dish("Banana")
            val orange = Dish("Orange")
            val pears = Dish("Pears")
            val cherries = Dish("Cherries")
            val nectarine = Dish("Nectarine")
            val mandarins = Dish("Mandarins")
            val kiwi = Dish("Kiwi")
            val pineapple = Dish("Pineapple")
            val list: List<Dish> = mutableListOf(apple, banana, orange, pears, cherries, nectarine, mandarins,
            kiwi, pineapple)

            foodGroup = FoodGroup(name, img, list)
        }
        if(nameFoodGroup == "Beans and Nuts"){
            val name = "Beans&Nuts"
            val img = R.drawable.ic_food_group_beans_nuts

            val beans = Dish("Beans")
            val garbanzoBeans = Dish("Garbanzo Beans")
            val lentils = Dish("Lentils")
            val cashews = Dish("Cashews")
            val walnuts = Dish("Walnuts")
            val peanuts = Dish(" Peanuts")
            val almonds = Dish("Almonds")
            val pecans = Dish("Pecans")
            val list: List<Dish> = mutableListOf(beans, garbanzoBeans, lentils, cashews, walnuts, peanuts,
            almonds, pecans)
            foodGroup = FoodGroup(name, img, list)
        }
        if (nameFoodGroup == "Meat"){
            val name = "Meat"
            val img = R.drawable.ic_food_group_meat

            val chicken = Dish("Chicken Breast")
            val beef = Dish("Beef")
            val lamb = Dish("Lamb")
            val turkey = Dish("turkey")
            val pork = Dish("Pork")
            val list: List<Dish> = mutableListOf(chicken, beef, lamb, turkey, pork)
            foodGroup = FoodGroup(name, img, list)
        }
        if (nameFoodGroup == "Fish"){
            val name = "Fish"
            val image = R.drawable.ic_food_group_fish

            val hake = Dish("Hake")
            val mackerel = Dish("Mackerel")
            val salmon = Dish("Salmon")
            val carp = Dish("Carp")
            val pike = Dish("Pike")
            val seaBass = Dish("Sea bass")
            val list: List<Dish> = mutableListOf(hake, mackerel, salmon, carp, pike, seaBass)
            foodGroup = FoodGroup(name, image, list)
        }
        if (nameFoodGroup == "Dairy Foods"){
            val name = "Dairy Foods"
            val image = R.drawable.ic_food_group_milk
            val milk = Dish("Milk")
            val cheese = Dish("Cheese")
            val yogurt = Dish("Yogurt")
            val butter = Dish("Butter")
            val casein = Dish("Casein")
            val iceCream = Dish("Ice Cream")
            val list: List<Dish> = mutableListOf(milk, cheese, yogurt, butter, casein, iceCream)
            foodGroup = FoodGroup(name, image, list)
        }
        if (nameFoodGroup == "Sweets"){
            val name = "Sweets"
            val image = R.drawable.ic_food_group_sweets

            val cake = Dish("Cake")
            val candies = Dish("Candies")
            val pie = Dish("Pie")
            val chocolate = Dish("Chocolate")
            val list: List<Dish> = mutableListOf(cake, candies, pie, chocolate)
            foodGroup = FoodGroup(name, image, list)
        }
        return foodGroup
    }
}