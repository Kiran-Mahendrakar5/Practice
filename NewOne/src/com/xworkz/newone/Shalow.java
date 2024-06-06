package com.xworkz.newone;

public class Shalow {
    private String name;
    
    // Constructor
    public Shalow(String name) {
        this.name = name;
    }
    
    // Getter for name
    public String getName() {
        return name;
    }
    
    // Setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    public static void main(String[] args) {
        // Create an object
        Shalow obj1 = new Shalow("Object 1");
        
        // Assign the reference of obj1 to obj2
        Shalow obj2 = obj1;
        
        // Now obj1 and obj2 both refer to the same object
        System.out.println("obj1: " + obj1.getName());
        System.out.println("obj2: " + obj2.getName());
        
        // Change the name of obj2
        obj2.setName("Updated Object");
        
        // This change will also be reflected in obj1
        System.out.println("obj1: " + obj1.getName());
        System.out.println("obj2: " + obj2.getName());
    }
}
