package com.triangle;

public class TriangleClassification {

   public static void main(String[] args) {

      try {
         if (args == null)
            System.out.println(Triangle.NOT_A_TRIANGLE);

         else if (args.length > 3)
            System.out.println(Triangle.NOT_A_TRIANGLE);
         else if (args.length < 3)
            System.out.println(Triangle.NOT_A_TRIANGLE);
         else {

            String s1 = args[0];
            String s2 = args[1];
            String s3 = args[2];

            Triangle t = new Triangle(s1, s2, s3);

            System.out.println(t.getTriangleClassification());
            
         }

      } catch (Exception e) {
         invalidTriangle();
      }
   }

   private static void invalidTriangle() {
      System.out.println(Triangle.NOT_A_TRIANGLE);
   }

}
