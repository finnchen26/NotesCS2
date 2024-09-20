// the word "void" represents the return type
public class ReturnTypes {
    /**To create a method that does return a value:
     Replace the word void with a data type, e.g. int, double or boolean etc.
     add a line with the keyword return inside our method*/
    public static void main(String[] args) {
        // if you want the constructor to run, you have to instantiate it in the psvm
        ReturnTypes myCode = new ReturnTypes();
    }

    public ReturnTypes(){
        System.out.println("Return types can be helpful");

        // example of returning a string: the data type of the method returnPotatoes() is a String, so to print it just use sout
        System.out.println(returnPotatoes());

        // example of returning an int
        System.out.println("I have a sum of " + countPotatoes(14, 32) + " potatoes.");

        //COUNTING POTATOES INTERLUDE
        // we want to write a method that will divide my potatoes evenly among everyone in class.
        // we must all eat the same amount of potatoes and whatever is left over is the remainder.
        // there is a math operation for this. it is modulo aka mod --> in code, it is the % symbol
        System.out.println("I have a remainder of " + remainingPotatoes(10, countPotatoes(14, 32)) + " potatoes."); // here, coutPotatoes() acts as an into of the numPotatoes

    }

    public String returnPotatoes(){
        return "potato";
    }

    public int countPotatoes(int yukons, int russets){
        return yukons + russets;
    }

    // example of method using modulo (when talking about modulo, we'll always use int and not decimal)
        // goal: divide our potatoes evenly and returns the remainder
    public int remainingPotatoes(int numPeople, int numPotatoes){
        return numPotatoes % numPeople;
    }

}
