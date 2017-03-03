/*
Jemma Tiongson
Section #16031
App: Methods
Purpose: Demonstrate ability to program and use methods - area/circumference of circle, Celcius to Fahrenheit, Fahrenheit to Celsius
min, max, odd, even, palindrome, sum of array, min/max of array, .charAt.
-------------------------------------------------------------------------
Methods are a group of statements that work together to execute an operation when called upon.

Terminal:
   Compile: javac Methods
   Run: java Methods
_________________________________________________________________________
*/
class Methods{
   //area of Circle
   public static int areaCircle(int radius){
      final double PI = 3.14159;
      double area = PI*Math.pow(radius,2);
      int newArea = (int) area;
      return newArea;
   }
   //circumference of Circle
   public static int circumferenceCircle(int radius){
      final double PI = 3.14159;
      double circCircle = 2*PI*radius;
      int newCirc = (int) circCircle;
      return newCirc;
   }
   //CtoF
   public static int CtoF(int degreesC){
      int constant = 32;
      double fraction = 1.8; //decimal version of 9/5
      double result = (degreesC * fraction) + constant;
      int newResult = (int) result;
      return newResult;
   }
   //FtoC
   public static int FtoC(int degreesF){
      int constant = 32;
      double fraction = .55556; //decimal version of 5/9
      double result = (degreesF - constant)*fraction;
      int newResult = (int) result;
      return newResult;
   }
   //min
   public static int min(int a, int b){
      int minValue;
      if(a < b){
         minValue = a;
      }
      else{
         minValue = b;
      }
      return minValue;
   }
   //max
   public static int max(int a, int b){
      int maxValue;
      if(a < b){
         maxValue = b;
      }
      else{
         maxValue = a;
      }
      return maxValue;
   }
   //odd
   public static boolean isOdd(int a){
      boolean retVal = false;
      if(a%2 != 0){
         retVal = true;
      }
      return retVal;
   }
   //even
   public static boolean isEven(int a) {
      return(a%2==0);
   }
   //palindrome
   public static boolean isPalindrome(String word){
      int begin = 0;
      int end = word.length()-1;
   
      while(begin < end){
         if (word.charAt(begin) != word.charAt(end)){
            return false;
         }
         begin++;
         end--;
      }
      return true;
   }
   //sum of an array
   public static int sumArray(int[] numArray){
      int total = 0;
      for(int i = 0; i < numArray.length; i++){
         total += numArray[i];
      }
      return (total);
   }
   //max value in an array
   public static int maxNum(int[] someArray){
      int max = 0;
      for(int i = 0; i < someArray.length; i++){
         if(someArray[i] > max){
            max = someArray[i];
         }
      }
      return max;
   }
   //min value in an array
   public static int minNum(int[] someArray){
      int min = someArray[0];
      for(int i = 0; i < someArray.length; i++){
         if(someArray[i] <= min){
            min = someArray[i];
         }
      }
      return min;
   }
   //string charAt() - find if char exists in string (returns boolean)
   public static boolean isCharPresent(String word, char c){
      char [] charArray = word.toCharArray();
      boolean result = false;
      for(int i = 0; i<charArray.length; i++){
         if(charArray[i] == c){
            result = true;
         }
      }
      return result;
   }
   
   public static void main (String [] args){
      // 3 tests for area
      System.out.println("Circle with radius 2 has an area of: " +areaCircle(2));
      System.out.println("Circle with radius 5 has an area of: " +areaCircle(5));
      System.out.println("Circle with radius 10 has an area of: " +areaCircle(10));
      System.out.println("---------------------");
      
      // 3 tests for circumference
      System.out.println("Circle with radius 3 has a circumference of: " +circumferenceCircle(3));
      System.out.println("Circle with radius 6 has a circumference of: " +circumferenceCircle(6));
      System.out.println("Circle with radius 11 has a circumference of: " +circumferenceCircle(11));
      System.out.println("---------------------");
      
      // 3 tests for CtoF
      System.out.println("10 degrees Celcius to Fahrenheit is: " +CtoF(10)+ " degrees.");
      System.out.println("-15 degrees Celcius to Fahrenheit is: " +CtoF(-15)+ " degrees.");
      System.out.println("27 degrees Celcius to Fahrenheit is: " +CtoF(27)+ " degrees.");
      System.out.println("---------------------");
      
      // 3 tests for FtoC
      System.out.println("65 degrees Fahrenheit to Celcius is: " +FtoC(65)+ " degrees.");
      System.out.println("101 degrees Fahrenheit to Celcius is: " +FtoC(101)+ " degrees.");
      System.out.println("40 degrees Fahrenheit to Celcius is: " +FtoC(40)+ " degrees.");
      System.out.println("---------------------");
      
      //3 tests for min
      System.out.println("The smallest value between 3 and 5 is: " +min(3,5));
      System.out.println("The smallest value between -3 and 8 is: " +min(-3,8));
      System.out.println("The smallest value between 4 and 1 is: " +min(4,1));
      System.out.println("---------------------");
      
      //3 tests for max
      System.out.println("The larger value between 4 and 9 is: " +max(4,9));
      System.out.println("The larger value between -3 and -7 is: " +max(-3,-7));
      System.out.println("The larger value between 12 and -40 is: " +max(12,-40));
      System.out.println("---------------------");
      
      //tests for isOdd
      int [] oddArray = {5, 2, -23, 35, 26, -258462};
      for(int i = 0; i<oddArray.length; i++){
         System.out.println("Is " +oddArray[i]+ " odd? " + isOdd(oddArray[i]));
      }
      System.out.println("---------------------");
      
      //tests for isEven
      int [] evenArray = {32, -66, 13, 12, 436218};
      for(int i = 0; i<evenArray.length; i++){
         System.out.println("Is " +evenArray[i]+ " even? " + isEven(evenArray[i]));
      }
      System.out.println("---------------------");
      
      //3 tests for Palindrome
      String [] word = {"hamburger", "madam", "racecar"};
      for(int i = 0; i<word.length; i++){
         System.out.println("Is \"" +word[i]+ "\" a palidrome? "+ isPalindrome(word[i]));
      }
      System.out.println("---------------------");
      
      //test for sumArray
      int [] someArray ={1,2,3,4,5};
      System.out.println("The sum of the array {1,2,3,4,5} is: " +sumArray(someArray));
      int [] someArray1 ={10,25,30,45,50};
      System.out.println("The sum of the array {10,25,30,45,50} is: " +sumArray(someArray1));
      int [] someArray2 ={21,32,43,54,65};
      System.out.println("The sum of the array {21,32,43,54,65} is: " +sumArray(someArray2));
      System.out.println("---------------------");
      
      //tests for max Value
      int [] numArray = {51,28,-3,47,1};
      System.out.println("The max value of the array {51,28,-3,47,1} is: " +maxNum(numArray));
      int [] numArray1 = {71,102,303,455,57};
      System.out.println("The max value of the array {71,102,303,455,57} is: " +maxNum(numArray1));
      int [] numArray2 = {-1,-2,3,74,65};
      System.out.println("The max value of the array {-1,-2,3,74,65} is: " +maxNum(numArray2));
      System.out.println("---------------------");
      
      //tests for min Value
      int [] numArray3 = {21,62,-3,74,50};
      System.out.println("The min value of the array {21,62,-3,74,50} is: " +minNum(numArray3));
      int [] numArray4 = {66,32,55,47,-10};
      System.out.println("The min value of the array {66,32,55,47,-10} is: " +minNum(numArray4));
      int [] numArray5 = {-25,-80,-90,-2,-1200};
      System.out.println("The min value of the array {-25,-80,-90,-2,-1200} is: " +minNum(numArray5));
      System.out.println("---------------------");
      
      //tests for charAt
      System.out.println("Does the String \"Jemma\" have the character \'o\'? " +isCharPresent("Jemma", 'o'));
      System.out.println("Does the String \"Hippo\" have the character \'i\'? " +isCharPresent("Hippo", 'i'));
      System.out.println("Does the String \"Friend\" have the character \'e\'? " +isCharPresent("Friend", 'e'));
   }
}