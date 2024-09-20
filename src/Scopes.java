public class Scopes { // scope = accessibility/usability in codes
    // declaration section: variables
    public String pet = "dog"; // variable pet is declared here so that it is accessible to all the code

    public static void main(String[] args) { // static doesn't need an object to run, and every object made gets all the non-static things
        Scopes myObject = new Scopes();
    }

    public Scopes(){
        System.out.println("1) " + pet);
        String pet = "iguana"; // not a redefinition of the original pet, but is instead a different new variable, just named the same
        System.out.println("2) " + pet);
        butIWantADog();
        taylorAlisonSwiftHousehold();
        elvisHousehold("dog");
    }

    public void butIWantADog(){
        System.out.println("3) " + pet);
    }

    public void taylorAlisonSwiftHousehold(){
        pet = "cat";
        System.out.println("4) " + pet);
    }

    public void elvisHousehold(String pet){
        this.pet = "monkey"; // appointing a specific pet when there are multiple pets
        pet = this.pet; // making anything put in the parameters = monkey
        System.out.println("5) " + pet);
    }

}
