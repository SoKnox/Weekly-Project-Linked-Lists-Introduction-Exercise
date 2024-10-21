/*
 * Sophie Knox
 * Linked Lists 1
 * 10/17/24
 * 
 * This class creates a linked list to store food list.
 * List is made of FoodNode objects. Each node has a correlating food name. It remoces and insterts the food name.

 */




package linked_lists1;

public class GroceryLinkedList 
{
    private FoodNode head;  

    // Constructor
    public GroceryLinkedList() 
    {
        //sets head to null aka initializes list as empty
        this.head = null;
    }

    //prints all the food items in list
    public void print()
    {
        FoodNode current = head;  //starts from the head node
        //Goes through list until the end aka nextHead == null 
        while (current != null) 
        {
            System.out.println(current.getFoodName());  //Priints the food nam
            current = current.getNextFood();  //Goes to next node
        }
    }

    //Insterts foodNode into a specific index
    public void insert(int index, FoodNode node) 
    {
        //Use insertAtStart when u insert at start of list 
        if (index == 0) 
{
            insertAtStart(node);
            return;
        }

        FoodNode current = head;  //Starts at headNode
        int count = 0;  //Tracks current index

        //Finds node before target index #
        while (current != null && count < index - 1) 
        {
            current = current.getNextFood();  //Moves to the next node
            count++;
        }

        // If we reach the end of the list before the index, the index is out of bounds
        if (current == null) 
        {
            System.out.println("Index out of bounds.");
        } else {
            // Insert the new node by updating the next references
            node.setNextFood(current.getNextFood());  // Link the new node to the next node
            current.setNextFood(node);  // Link the current node to the new node
        }
    }

    //inserts a new FoodNode after a specific food 
    public void insert(String food, FoodNode node)
    {
        // finds the index of the food item
        int index = find(food);

        // if the food is found (index != -1), insert the new node after it
        if (index != -1)
        {
            insert(index + 1, node);  //insterts the new node after the index
        }
    }

    //insterts node at the start
    public void insertAtStart(FoodNode node)
    {
        node.setNextFood(head);  //node points to current head
        head = node;  //node becomes front ofl list
    }

    //insterts node at end of list
    public void insertAtEnd(FoodNode node) 
    {
        //if list == empty, make new node at start
        if (head == null) 
        {
            head = node;
            return;
        }

        FoodNode current = head;  //start at head node
        //goes through to last node in the list
        while (current.getNextFood() != null) 
        {
            current = current.getNextFood();  //moves to next node
        }

        current.setNextFood(node);  //puts last node next to new node
    }

    //checks if list is empty
    public boolean isEmpty()
    {
        // returns true if the head is null (no nodes in the list)
        return head == null;
    }

    //uses name to find index
    public int find(String food) 
    {
        FoodNode current = head;  //startsat head node
        int index = 0;  //tacks current index positionr

        // goes through list until the end orr if the food is found
        while (current != null) 
        {
            //If the food is found, return the food’s index
            if (current.getFoodName().equals(food)) 
            {
                return index;
            }
            current = current.getNextFood();  //Moves to the next node
            index++;  // Increment the index
        }

        return -1;  // Return -1 if the food is not found in the list
    }

    // Removes a specific food item 
    public void remove(String food)
    {
        // If the list is empty, print a message and return
        if (head == null) 
        {
            System.out.println("List is empty.");
            return;
        }

        // If the food I want to remove is the first item in the list
        if (head.getFoodName().equals(food)) 
        {
            head = head.getNextFood();  //moves head to next node
            return;
        }

        FoodNode current = head;  //Starts at head node

        //Go through the list to find the node right before the one I want to remove
        while (current.getNextFood() != null && !current.getNextFood().getFoodName().equals(food)) 
        {
            current = current.getNextFood();  //Moves to next node
        }

        //prints food not found if cant find the food
        if (current.getNextFood() == null) 
        {
            System.out.println("Food not found.");
        } else 
        {
            //skips the node aka it removes it
            current.setNextFood(current.getNextFood().getNextFood());
        }
    }
}
