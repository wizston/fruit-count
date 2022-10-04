# JAVA Assessment
#### Design and write a Java program that:
1. reads in a list of words from an array
2. determines the number of words in the list that start with each
   letter of the alphabet
3. outputs the results to the console, in alphabetical order (one
   letter per line)
   Example Input:
   String[] fruits = {"Apple", "Apricot", "Cherry", "Banana", "Cherry", "Papaya",
   "Cantaloupe"}; <br>
   Example Output: <br>
   A: 2 <br>
   B: 1 <br>
   C: 3 <br>
   D: 0 <br>
   E: 0 <br>
   F: 0 <br>
   G: 0 <br>
   H: 0 <br>
   I: 0 <br>
   J: 0 <br>
   K: 0 <br>
   L: 0 <br>
   M: 0 <br>
   N: 0 <br>
   O: 0 <br>
   P: 1 <br>
   Q: 0 <br>
   R: 0 <br>
   S: 0 <br>
   T: 0 <br>
   U: 0 <br>
   V: 0 <br>
   W: 0 <br>
   X: 0 <br>
   Y: 0 <br>
   Z: 0 <br>
4. Add this output as a choice when the program starts. The new
   output should be like this: <br>
   A: 1 <br>
   1 Apple <br>
   B: 2 <br>
   1 Banana <br>
   1 Blueberry <br>
   C: 1 <br>
   1 Cherry <br>
   D:  0 <br>
   etc... <br>
5. If the JSON instead of being a string is an HTTP Response from a
   “Fruits API” and this Request cannot fail. How can you manage
   to handle the errors of the HTTP Response? Please code the
   answer. <br>
   Use this code: <br>

````
   public class CountFruits {
       public static void main(String[] args) {
           String[] fruits = {"Strawberry", "Mango", "Cherry", "Lime", "Guava",
             "Papaya", "Nectarine", "Pineapple", "Lemon", "Plum", "Tangerine", "Fig",
             "Blueberry", "Grape", "Jackfruit", "Pomegranate", "Apple", "Pear",
             "Orange", "Watermelon", "Raspberry", "Banana"};
             
   }
````