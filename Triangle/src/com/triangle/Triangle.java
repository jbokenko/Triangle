package com.triangle;

import java.math.BigDecimal;

/**
 * @author Jeff
 *
 */
public class Triangle {
   
   // Triangle Classifications
   public static final String NOT_A_TRIANGLE = "not a triangle";
   public static final String EQUILATERAL = "equilateral";
   public static final String ISOSCELES = "isosceles";
   public static final String SCALENE = "scalene";
   
   // Triangle data
   private BigDecimal sideOne;
   private BigDecimal sideTwo;
   private BigDecimal sideThree;
   
   /**
    * Constructor: Uses the parameters to build BigDecimal objects. If it fails, it returns an exception.
    * @param side1
    * @param side2
    * @param side3
    * @throws Exception
    */
   public Triangle(String side1, String side2, String side3) throws Exception {
      this.sideOne = new BigDecimal(side1);
      this.sideTwo = new BigDecimal(side2);
      this.sideThree = new BigDecimal(side3);
   }
   
   // -------------------- Getters and Setters ---------------------

   public BigDecimal getSideOne() {
      return sideOne;
   }

   public void setSideOne(BigDecimal sideOne) {
      this.sideOne = sideOne;
   }

   public BigDecimal getSideTwo() {
      return sideTwo;
   }

   public void setSideTwo(BigDecimal sideTwo) {
      this.sideTwo = sideTwo;
   }

   public BigDecimal getSideThree() {
      return sideThree;
   }

   public void setSideThree(BigDecimal sideThree) {
      this.sideThree = sideThree;
   }

   
   
   /**
    * Determines if the three sides can produce a valid triangle.
    * @return
    */
   public boolean isValidTriangle() {
      // To prove if a triangle is valid, the sum of two sides must be
      // greater than the length of the third side.
      // Or the sum of the two smaller sides > the third (largest) side

      if (sideOne == null)
         return false;
      if (sideTwo == null)
         return false;
      if (sideThree == null)
         return false;

      if (sideOne.add(sideTwo).compareTo(sideThree) > 0) {
         if (sideOne.add(sideThree).compareTo(sideTwo) > 0) {
            if (sideTwo.add(sideThree).compareTo(sideOne) > 0) {
               return true;
            }
         }
      }
      return false;

   }

   /**
    * Determines if the sides of the triangle are equilateral.
    * @return
    */
   public boolean isEquilateral() {
      if (!isValidTriangle())
         return false;
      
    if (sideOne.compareTo(sideTwo) == 0) {
       if (sideTwo.compareTo(sideThree) == 0) {
          return true;
       }
    }
      
      return false;
   }

   /**
    * Determines if the sides of the triangle are isosceles.
    * @return
    */
   public boolean isIsosceles() {
      if (!isValidTriangle())
         return false;
      
      int matchCount = 0;
      if (sideOne.compareTo(sideTwo) == 0)
         matchCount ++;
      if (sideTwo.compareTo(sideThree) == 0)
         matchCount ++;
      if (sideOne.compareTo(sideThree) == 0)
         matchCount ++;

      if (matchCount > 0)
         return true;
      
      return false;
   }
   
   
   /**
    * Determines if the sides of the triangle are scalene.
    * @return
    */
   public boolean isScalene() {
      if (!isValidTriangle())
         return false;
      return true;
   }
   
   
   /**
    * Returns a String representing the type of triangle the sides form.
    * Valid responses are equilateral, isosceles, scalene or not a triangle.
    * @return
    */
   public String getTriangleClassification ()
   {
      if (!isValidTriangle())  
         return NOT_A_TRIANGLE;
      if (isEquilateral())
         return EQUILATERAL;
      if (isIsosceles())
         return ISOSCELES;
      
      return SCALENE;
   }

   /**
    * Returns a String representing this triangle class.
    * Used for debugging purposes.
    * @return
    */
   public String toString()
   {
      StringBuilder sb = new StringBuilder();
      sb.append("Triangle:\n");
      sb.append("\tSide 1=[").append(sideOne).append("]\n");
      sb.append("\tSide 2=[").append(sideTwo).append("]\n");
      sb.append("\tSide 3=[").append(sideThree).append("]\n");
      sb.append("\tisValidTriangle=[").append(isValidTriangle()).append("]\n");
      sb.append("\tisEquilateral=[").append(isEquilateral()).append("]\n");
      sb.append("\tisIsosceles=[").append(isIsosceles()).append("]\n");
      sb.append("\tisScalene=[").append(isScalene()).append("]\n");
      sb.append("\tgetTriangleClassification=[").append(getTriangleClassification()).append("]\n");
      sb.append("\n");
      
      return sb.toString();
   }

}
