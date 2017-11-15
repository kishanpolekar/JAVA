public class Bottle {
    
    String color="Black";
    double price=0.0;
    int capacity=1000, currAmt=0;
    
    public Bottle() {}
    
    public Bottle(String col, double pr) {
    
        color=col;
        price=pr;
    }
    
    public Bottle(String col, double pr, int cap) {
    
        color=col;
        price=pr;
        capacity=cap;
    }
    
    public void emptyBottle() {
    
        currAmt=0;
        System.out.println("Bottle emptied!!");
    }
    
    public void fillAmt(int amt) {
    
        if ((currAmt+amt)>capacity) {
            System.out.println("Cannot fill amount as it exceeds capacity!");
        } else {
            currAmt+=amt;
            System.out.println("Amount filled. The bottle now has "+currAmt+" mL of water.");
        }
    }
    
    public void newPrice(double newpr) {
    
        price=newpr;
        System.out.println("Price set. New price of the bottle: "+price);
    }
    
    public int getAmt() {
    
        return currAmt;
    }
    
    public double getPrice() {
    
        return price;
    }
}
