public class WaterBottle {

    public static void main(String[] args) {
    
        Bottle b1=new Bottle();
        System.out.println("\nNew Bottle 1 created!\nCurrent Status:");
        System.out.println("Color: "+b1.color+"\tCapacity: "+b1.capacity+"\tPrice: "+b1.price+"\tCurrent amount filled: "+b1.currAmt);
        b1.newPrice(50);
        
        Bottle b2=new Bottle("Blue",70);
        System.out.println("\nNew Bottle 2 created!\nCurrent Status:");
        System.out.println("Color: "+b2.color+"\tCapacity: "+b2.capacity+"\tPrice: "+b2.price+"\tCurrent amount filled: "+b2.currAmt);
        b2.fillAmt(600);
        b2.fillAmt(600);
        
        Bottle b3=new Bottle("Green",49.75,750);
        System.out.println("\nNew Bottle 3 created!\nCurrent Status:");
        System.out.println("Color: "+b3.color+"\tCapacity: "+b3.capacity+"\tPrice: "+b3.price+"\tCurrent amount filled: "+b3.currAmt);
        b3.fillAmt(400);
        b3.emptyBottle();
        System.out.println("The bottle now has "+b3.getAmt()+" mL of water.");
    } 
}
