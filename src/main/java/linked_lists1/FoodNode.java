/*
 * Sophie Knox
 * Linked Lists 1
 * 10/17/24
 * This class provides 1)  constructor that initializes the FoodNode with a food name
 * - 2) Getters and setters that access and modify the foodName and nextFood
 *
 */




package linked_lists1;

public class FoodNode 
{
    private String foodName;
    private FoodNode nextFood;

    //constructor
    public FoodNode(String foodName) 
    {
        this.foodName = foodName;
        this.nextFood = null;  //next node = null
    }

    //RUBRIC 5% Getters and Setters
    //Getters + setters
    public String getFoodName() 
    {
        return foodName;
    }

    public void setFoodName(String foodName) 
    {
        this.foodName = foodName;
    }

    public FoodNode getNextFood()
     {
        return nextFood;
    }

    public void setNextFood(FoodNode nextFood)
     {
        this.nextFood = nextFood;
    }
}
