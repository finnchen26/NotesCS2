import java.sql.SQLOutput;

public class WhileBreak {
    public static void main(String[] args) {
        WhileBreak myCode = new WhileBreak();
    }

    public WhileBreak() {
//        moreFreeDonutWheel();
//        mostFreeDonuts();
        dunkinOrder();
        System.out.println("We need " + dunkinOrder() + " dozen donuts.");
    }

    public void freeDonutWheel() {
        System.out.println("Welcome to dunkin, Matt and Ben want you to have free donuts today.");
        System.out.println("Spin the wheel to see how many free donuts you win today!");

        int freeDonuts = (int) (Math.random() * 13);

        System.out.println("You get " + freeDonuts + " free donuts.");
    }

    public void moreFreeDonutWheel() {
        System.out.println("Welcome to dunkin, Matt and Ben want you to have free donuts today.");
        System.out.println("Spin the wheel to see how many free donuts you win today!");
        System.out.println("If you can say 'how bout them apples' in a boston accent, you can spin again");

        // while loop example:
        // while loop will run as long as its conditions remains true
        int i = 0; // initializing an integer i at 0
        int freeDonuts = 0;

        while (i < 10) {
            freeDonuts = (int) (Math.random() * 13);
            i++; // similar to the condition of for loop

            if (freeDonuts >= 10){
                break; // stopping the loop when we're satisfied with the result
            }
        }

        System.out.println("After " + i + " spins, you get " + freeDonuts + " free donuts.");
    }

    public void mostFreeDonuts(){
        System.out.println("Welcome to dunkin, Matt and Ben want you to have free donuts today.");
        System.out.println("Spin the wheel to see how many free donuts you win today!");
        System.out.println("If you can say 'how bout them apples' in a boston accent, you can spin again");

        int i = 0;
        int freeDonuts = 0;
        while(true) { // true is a boolean that will always be true, so it goes on for forever unless called break or meets condition
            freeDonuts = (int)(Math.random()*13);
            i++;
            if(freeDonuts >= 12){
                break;
            }
        }
        System.out.println("After " + i + " spins, you get " + freeDonuts + " free donuts.");
    }

    public int dunkinOrder(){
        int numOfBoxes = 0;
        int numPeople = 133;
        // use a while loop and a mod % to count how many dozen donuts we should order
        int i = 1;
        while (i <= numPeople){
            if(i % 12 == 0){
                numOfBoxes += 1;
            }
            i++;
        }
        if (numPeople % 12 != 0){
            numOfBoxes += 1;
        }

        return numOfBoxes;
    }

}