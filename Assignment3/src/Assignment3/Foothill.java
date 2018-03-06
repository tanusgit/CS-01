package Assignment3;
/*
My name is Tanusree Debnath. This class is
CS F001A 02W Object-Oriented Programming Method Java.
Date is 28th January, 2018.
My instructor is Dave Harden. 
File name is Foothill.java. This program prints ingredients name, asks for the
recipe name , serving size and amount of ingredients from the user.
It then calculates and prints the nutrition values of ingredients used in the
recipe.
*/

import java.util.Scanner;
public class Foothill {
	

	   // food #1 constants
	   static final String FOOD_1_NAME = "Tofu";
	   static final double FOOD_1_protein_P100G = 8;  // in calories
	   static final double FOOD_1_iron_P100G = 5.4;   // in grams
	   static final double FOOD_1_vitA_P100G = .000009;   // in grams
	   static final double FOOD_1_sugar_P100G = 0.3;   // in grams
	   static final double FOOD_1_vitC_P100G = 0;   // in grams
	   static final double FOOD_1_vitD_P100G = 0;   // in grams
	   
	   // food #2 constants
	   static final String FOOD_2_NAME = "Mushroom";
	   static final double FOOD_2_protein_P100G = 3.1;  // in calories
	   static final double FOOD_2_iron_P100G = 0.36;   // in grams
	   static final double FOOD_2_vitA_P100G = 0;   // in grams
	   static final double FOOD_2_sugar_P100G = 2;   // in grams
	   static final double FOOD_2_vitC_P100G = .0027;   // in grams
	   static final double FOOD_2_vitD_P100G = 0;   // in grams
	   
	   // food #3 constants
	   static final String FOOD_3_NAME = "Broccoli";
	   static final double FOOD_3_protein_P100G = 2.8;  // in calories
	   static final double FOOD_3_iron_P100G = .54;   // in grams
	   static final double FOOD_3_vitA_P100G = .000108;   // in grams
	   static final double FOOD_3_sugar_P100G = 1.7;   // in grams
	   static final double FOOD_3_vitC_P100G = .1332;   // in grams
	   static final double FOOD_3_vitD_P100G = 0;   // in grams
	   
	  // food #4 constants
	   static final String FOOD_4_NAME = "Onion";
	   static final double FOOD_4_protein_P100G = 1.2;  // in calories
	   static final double FOOD_4_iron_P100G = 0.18;   // in grams
	   static final double FOOD_4_vitA_P100G = 0;   // in grams
	   static final double FOOD_4_sugar_P100G = 4.2;   // in grams
	   static final double FOOD_4_vitC_P100G = .0117;   // in grams
	   static final double FOOD_4_vitD_P100G = 0;   // in grams
	   
	  // food #5 constants
	   static final String FOOD_5_NAME = "Bell pepper";
	   static final double FOOD_5_protein_P100G = 0.9;  // in calories
	   static final double FOOD_5_iron_P100G = 0.18;   // in grams
	   static final double FOOD_5_vitA_P100G = 0.000063;   // in grams
	   static final double FOOD_5_sugar_P100G = 2.4;   // in grams
	   static final double FOOD_5_vitC_P100G = 0.1206;   // in grams
	   static final double FOOD_5_vitD_P100G = 0;   // in grams
	   
	  // food #6 constants
	   static final String FOOD_6_NAME = "Carrot";
	   static final double FOOD_6_protein_P100G = 0.9;  // in grams
	   static final double FOOD_6_iron_P100G = 0.18;   // in grams
	   static final double FOOD_6_vitA_P100G = .003006;   // in grams
	   static final double FOOD_6_sugar_P100G = 4.7;   // in grams
	   static final double FOOD_6_vitC_P100G = .0072;   // in grams
	   static final double FOOD_6_vitD_P100G = 0;   // in grams
	   
	   static final String INDENT = "   ";
	   static final String SEPARATOR = "\n";
	   public static final int lowerServingSize = 1;
	   public static final int UpperServingSize = 15;
	   
	   private static boolean validServ(int numServ) {
		   if (numServ < lowerServingSize || numServ > UpperServingSize) {
			   System.out.println("Servings size invalid, must be between"
			   		+ " 1 and 15");
			   return false;
		   }
		   return true;
	   }
	   public static final int lowerServingAmount = 0;
	   public static final int upperServingAmount = 1500;
	   private static boolean validAmount(int a) {
		   if (a < lowerServingAmount || a > upperServingAmount) {
			   System.out.println("Servings amount invalid, must be between 0"
			   		+ " and 1500");
			   return false;
		   }
		   return true;
	   }
	   public static void main(String[] args)
	   {
	      String recipeName, userInputStr;
	      int userInputInt, numServ;
	      double totalvitC, totalsugar, totalvitA, totalvitD, protein, iron;
	      Scanner inputStream = new Scanner(System.in);
	      
	      // initialize accumulator variables
	      totalvitC = 0;
	      totalsugar = 0;
	      totalvitA = 0;
	      totalvitD = 0;
	      protein = 0;
	      iron = 0;
	      
	      // print menu
	      System.out.println("----- List of Possible Ingredients -----");
	      System.out.println(INDENT + "Food #1: " + FOOD_1_NAME);
	      System.out.println(INDENT + "Food #2: " + FOOD_2_NAME);
	      System.out.println(INDENT + "Food #3: " + FOOD_3_NAME);
	      System.out.println(INDENT + "Food #4: " + FOOD_4_NAME);
	      System.out.println(INDENT + "Food #5: " + FOOD_5_NAME);
	      System.out.println(INDENT + "Food #6: " + FOOD_6_NAME + SEPARATOR);      
	    
	      // name of recipe
	      System.out.print("What are you calling this recipe ? ");
	      recipeName  = inputStream.nextLine();
	      
	      // name of recipe
	      System.out.print("How many servings ? ");
	      userInputStr  = inputStream.nextLine();
	      numServ = Integer.parseInt(userInputStr);
	      if (!validServ(numServ))
	    	  return;

	      // food #1 ---------------------------------------------------------
	      System.out.print("How many grams of " + FOOD_1_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      if (!validAmount(userInputInt))
	    	  return;
	      
	      // update accumulators
	      protein += userInputInt * (FOOD_1_protein_P100G / 100.);
	      iron  += userInputInt * (FOOD_1_iron_P100G / 100.);
	      totalvitA  += userInputInt * (FOOD_1_vitA_P100G / 100.);
	      totalsugar  += userInputInt * (FOOD_1_sugar_P100G / 100.);
	      totalvitC  += userInputInt * (FOOD_1_vitC_P100G / 100.);
	      totalvitD  += userInputInt * (FOOD_1_vitD_P100G / 100.);

	      // food #2 ---------------------------------------------------------
	      System.out.print("How many grams of " + FOOD_2_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      if (!validAmount(userInputInt))
	    	  return;
	      
	      // update accumulators
	      protein += userInputInt * (FOOD_2_protein_P100G / 100.);
	      iron  += userInputInt * (FOOD_2_iron_P100G / 100.);
	      totalvitA  += userInputInt * (FOOD_2_vitA_P100G / 100.);
	      totalsugar  += userInputInt * (FOOD_2_sugar_P100G / 100.);
	      totalvitC  += userInputInt * (FOOD_2_vitC_P100G / 100.);
	      totalvitD  += userInputInt * (FOOD_2_vitD_P100G / 100.);

	      // food #3 ---------------------------------------------------------
	      System.out.print("How many grams of " + FOOD_3_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      if (!validAmount(userInputInt))
	    	  return;
	      
	      // update accumulators
	      protein += userInputInt * (FOOD_3_protein_P100G / 100.);
	      iron  += userInputInt * (FOOD_3_iron_P100G / 100.);   
	      totalvitA  += userInputInt * (FOOD_3_vitA_P100G / 100.);
	      totalsugar  += userInputInt * (FOOD_3_sugar_P100G / 100.);
	      totalvitC  += userInputInt * (FOOD_3_vitC_P100G / 100.);
	      totalvitD  += userInputInt * (FOOD_3_vitD_P100G / 100.);
	      
	      // food # ---------------------------------------------------------
	      System.out.print("How many grams of " + FOOD_4_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      if (!validAmount(userInputInt))
	    	  return;
	      
	      // update accumulators
	      protein += userInputInt * (FOOD_4_protein_P100G / 100.);
	      iron  += userInputInt * (FOOD_4_iron_P100G / 100.);   
	      totalvitA  += userInputInt * (FOOD_4_vitA_P100G / 100.);
	      totalsugar  += userInputInt * (FOOD_4_sugar_P100G / 100.);
	      totalvitC  += userInputInt * (FOOD_4_vitC_P100G / 100.);
	      totalvitD  += userInputInt * (FOOD_4_vitD_P100G / 100.);
	      // food #5 ---------------------------------------------------------
	      System.out.print("How many grams of " + FOOD_5_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      if (!validAmount(userInputInt))
	    	  return;
	      
	      // update accumulators
	      protein += userInputInt * (FOOD_5_protein_P100G / 100.);
	      iron  += userInputInt * (FOOD_5_iron_P100G / 100.);   
	      totalvitA  += userInputInt * (FOOD_5_vitA_P100G / 100.);
	      totalsugar  += userInputInt * (FOOD_5_sugar_P100G / 100.);
	      totalvitC  += userInputInt * (FOOD_5_vitC_P100G / 100.);
	      totalvitD  += userInputInt * (FOOD_5_vitD_P100G / 100.);
	      
	      // food #6 ---------------------------------------------------------
	      System.out.print("How many grams of " + FOOD_6_NAME + "? ");
	      userInputStr = inputStream.nextLine();
	      userInputInt = Integer.parseInt(userInputStr);
	      if (!validAmount(userInputInt))
	    	  return;
	      
	      // update accumulators
	      protein += userInputInt * (FOOD_6_protein_P100G / 100.);
	      iron  += userInputInt * (FOOD_6_iron_P100G / 100.); 
	      totalvitA  += userInputInt * (FOOD_6_vitA_P100G / 100.);
	      totalsugar  += userInputInt * (FOOD_6_sugar_P100G / 100.);
	      totalvitC  += userInputInt * (FOOD_6_vitC_P100G / 100.);
	      totalvitD  += userInputInt * (FOOD_6_vitD_P100G / 100.);
	      inputStream.close();
	      
	      // report results --------------------------------------------------
	      System.out.println("\nNutrition for " + recipeName + " per serving"
	    		  +".........");
	      System.out.println(INDENT + "Total vitamin C is " + totalvitC/numServ 
	    		  + " grams");
	      System.out.println(INDENT + "Total vitamin B is " + totalsugar/numServ
	    		  + " grams");
	      System.out.println(INDENT + "Total vitamin A is " + totalvitA/numServ
	    		  + " grams");
	      System.out.println(INDENT + "Total vitamin D is " + totalvitD/numServ
	    		  + " grams");
	      System.out.println(INDENT + "Total protein is " + protein/numServ
	    		  + " grams");
	      System.out.println(INDENT + "Total iron is " + iron/numServ
	    		  + " grams");      
	   }
	}
/*
---------- List of Possible Ingredients ---------
   Food #1: Tofu
   Food #2: Mushroom
   Food #3: Broccoli
   Food #4: Onion
   Food #5: Bell pepper
   Food #6: Carrot

What are you calling this recipe ? Mushroom curry
How many servings ? 2
How many grams of Tofu? 100
How many grams of Mushroom? 200
How many grams of Broccoli? 200
How many grams of Onion? 400
How many grams of Bell pepper? 300
How many grams of Carrot? 300

Nutrition for Mushroom curry per serving.........
   Total vitamin C is 0.35100000000000003 grams
   Total vitamin B is 22.9 grams
   Total vitamin A is 0.004716 grams
   Total vitamin D is 0.0 grams
   Total protein is 14.999999999999998 grams
   Total iron is 4.5 grams

*/

