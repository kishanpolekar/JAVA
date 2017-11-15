import java.util.Scanner;

public class FixedOOPS2 {
    public static void main(String[] args) {
        
        int sum = 0, total=0;

	Scanner console = new Scanner(System.in);

	System.out.print("Is your money multiplied 1 or 2 times?");
	int times = console.nextInt();
        System.out.print("And how much are you contributing? ");
        int donation = console.nextInt();
	if (times == 1){
            sum = sum + donation;
	}
	else{
            sum = sum + (2 * donation);
	}
        total+=sum;
	System.out.println("The total is " + total);
    }
}