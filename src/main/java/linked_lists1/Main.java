/*
 * Sophie Knox
 * Linked Lists 1
 * 10/17/24
 * This class run a series of tests that insert,remove,find and prints different items.
 * It creates a GroceryLinkedList object and runs a series of tests 
 * to verify the functionality of the linked list operations.
 *
 *
 */

package linked_lists1;

public class Main 
{
    public static void main(String[] args) 
    {
        GroceryLinkedList groceryList = new GroceryLinkedList();
        //RUBRIC 70% Tests

        //Test 1
        System.out.println("Test 1");
        groceryList.insertAtEnd(new FoodNode("milk"));
        groceryList.insertAtEnd(new FoodNode("bananas"));
        groceryList.insertAtEnd(new FoodNode("ice cream"));
        groceryList.insertAtEnd(new FoodNode("spinach"));
        groceryList.insertAtEnd(new FoodNode("chicken"));
        groceryList.print();
        System.out.println();

        //Test 2
        System.out.println("Test 2");
        groceryList.remove("ice cream");
        groceryList.print();
        System.out.println();

        //Test 3
        System.out.println("Test 3");
        groceryList.remove("chicken");
        groceryList.print();
        System.out.println();

        //Test 4
        System.out.println("Test 4");
        int spinachIndex = groceryList.find("spinach");
        if (spinachIndex != -1) 
        {
            System.out.println("Spinach is at index " + spinachIndex);
        } else
         {
            groceryList.insertAtEnd(new FoodNode("spinach"));
        }
        groceryList.print();
        System.out.println();

        //Test 5
        System.out.println("Test 5");
        int eggsIndex = groceryList.find("eggs");
        if (eggsIndex != -1)
         {
            System.out.println("Eggs are at index " + eggsIndex);
        } else
         {
            groceryList.insertAtEnd(new FoodNode("eggs"));
        }
        groceryList.print();
        System.out.println();

        //Test 6
        System.out.println("Test 6");
        groceryList.insertAtStart(new FoodNode("onions"));
        groceryList.print();
        System.out.println();

        //Test 7
        System.out.println("Test 7");
        groceryList.insert("bananas", new FoodNode("strawberries"));
        groceryList.print();
    }
}
