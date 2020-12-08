package SquirrelDemo;

import SquirrelDemo.DefineSquirrel;

public class SquirrelMain{
  // Instance variables
  Squirrel squirrel1;
  Squirrel squirrel2;
  Squirrel squirrel3;
  
   public static void main(String[] args){
    

    // Create 3 squirrels
    squirrel1 = new Squirrel("tree", " brown", 10, 200);
    squirrel2 = new Squirrel("ground", " black", 5, 100);
    squirrel3 = new Squirrel("leaves", " red", 15, 500);


    // Movement
    squirrel1.movement("jumping");
    squirrel2.movement("running");
    squirrel3.movement("sleeping");

    // Eating
    squirrel1.eating("dirt");
    squirrel2.eating("nuts");
    squirrel3.eating("seeds");

    // Defend home
    squirrel1.defend("nest");
    squirrel2.defend("den");
    squirrel3.defend("twig");
  }

}