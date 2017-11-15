
import java.util.Scanner;

/*
@author: Kishan

Project: P3.java
Description: Finding the last index of a value in an array.

*/
public class P3 {

    public static void main(String[] args) {

        System.out.println("Last index of a number in an array\n\nEnter the elemets of the array:\n");
        int list[] = new int [10];
        Scanner a=new Scanner(System.in);
        for (int i=0;i<10;i++) {
        
            list[i]=a.nextInt();
        }
        System.out.println("The array entered is: \n");
        for (int i=0;i<list.length;i++) {
        
            System.out.print(list[i]+"\t");
        }
        System.out.print("\nEnter the number whose last index is to be found: ");
        int num=a.nextInt();
        int p=lastIndexOf(list,num);
        System.out.println("The last index of "+num+" in the array is "+p);
    }

    public static int lastIndexOf(int[] list, int num) {
    
        int pos=-1;
        for (int i=0;i<list.length;i++) {
            
            if (num==list[i]) {
            
                pos=i;
            }
        }
        return pos;
    }

}
