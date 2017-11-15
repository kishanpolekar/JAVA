package equation;

import java.util.Scanner;

public class TestEquation {

    public static void main(String[] args) {

        System.out.println("Linear Equation Solver\n");
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter six values for the equation(a,b,c,d,e,f): \n");
        double [] val=new double[6];
        for (int i=0; i<6; i++) {
        
            val[i]=input.nextDouble();
        }
        
        LinearEquation eq=new LinearEquation(val[0], val[1], val[2], val[3], val[4], val[5]);
        
        String output=(eq.isSolvable()) ? ("The value of 'x' is: "+eq.getX()+"\nThe value of 'y' is: "+eq.getY()) : "The equation has no solution!!\n";
        System.out.println(output);
    }

}
