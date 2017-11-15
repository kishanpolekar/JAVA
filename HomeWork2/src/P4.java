/*
@author: Kishan

Project: P4.java
Description: Method overloading. Example taken: printMe

*/
public class P4 {

    public static void main(String[] args) {

        System.out.println("Method Overloading");
        printMe('o',5);
        printMe(1,7);
        printMe(3.7,'i',3);
        printMe("mojo",4);
        System.out.println();
    }

    public static void printMe(char c, int n) {
        
        System.out.println();
        for (int i=0;i<n;i++) {
        
            System.out.print(c);
        }
    }
    
    public static void printMe(int someInt, int n) {
    
        System.out.println();
        for (int i=0;i<n;i++) {
        
            System.out.print(someInt);
        }
    }
    
    public static void printMe(double someDouble, char c, int n) {
    
        System.out.println();
        for (int i=0;i<n;i++) {
        
            System.out.print(someDouble+""+c);
        }
    }
    
    public static void printMe(String s, int n) {
    
        System.out.println();
        for (int i=0;i<n;i++) {
        
            System.out.print(s);
        }
    }

}
