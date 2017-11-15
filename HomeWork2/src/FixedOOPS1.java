//This program will display the smaller of the two
//numbers a and b. Assume that a and b will never be
//equal.

public class FixedOOPS1 {
    public static void main(String[] args) {

        int a = 7, b = 42;  //declaration of local variables.
        int smaller=minimum(a, b);  //call method to find the min. of a and b.
	if (smaller == a)  // this branch is taken if a is < b.
            System.out.println("a is the smallest!");
	else System.out.println("b is the smallest!");
    }

    public static int minimum(int a, int b){
        int smaller;
	if (a < b){
            smaller = a;
	}
        else {
            smaller = b;
	}
	//return the variable smaller, which should contain the smaller of a & b.
	return smaller;
    }
}