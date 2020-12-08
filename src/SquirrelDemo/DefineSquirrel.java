package SquirrelDemo;

public class DefineSquirrel{
  // instance variables

  String foodstorage;
  String colour;
  int age; 
  int weight;

  public Squirrel(String newFoodStorage, String newColour, int newAge, int newWeight){
    this.foodstorage = newFoodStorage;
    this.colour = newColour;
    this.age = newAge;
    this.weight = newWeight;
  }

  public void movement(String strMovement){
    System.out.println(this.squirrel + " is " + strMovement);
  }

  public void eating(String strFood){
    System.out.println(this.squirrel + " is eating " + strFood);
  }

  public void defend(String strHome){
    System.out.println(this.squirrel + " is defending " + strHome);
  }
}
