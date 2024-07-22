/*
    what is recursion ?
    -Any function which calls itself is call recursive.
    -A recursive method solves a problem by calling a copy of itself to work on a 
     smaller problem .this called recursion step..
    - Write a iterative code

 */
public class Recursion {
    public static void printNo(int n){
        if (n==0) {
            return;
        }
        System.out.println(n);
        printNo(n-1);;
    }
    public static void main(String[] args) {
        int n =5;
        printNo(n);
    }
}