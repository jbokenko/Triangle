package com.triangle;

public class MiscUtils {
   
   
   /**
    * Returns a non null String.  If the inString is null then an empty string returned.
    * If the string is not null, then it will trim the string and return it.
    * 
    * @param inString
    * @return
    */
   public static final String getNotNullString(String inString) {

      if (inString == null) {
         return "";
      }
      return inString.trim();
   }

}
