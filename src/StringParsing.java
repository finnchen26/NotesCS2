public class StringParsing {
    public static void main(String[] args) {
        StringParsing myCode = new StringParsing();
    }

    public StringParsing() {
        example1();
        String phonebook1 = "Here is a phone number, Phone: (231)-407-4553";
        String phonebook = "In the ancient phone book you find a number for all four teletubbies. The first number you come across is " +
                "Dipsy's Phone:(476)-892-1130. Dipsy is the green teletubbie. The next phone number you find is for the red one, " +
                "Po, Phone:(241)-557-8943. Next up is Tinky-Winky's Phone:(395)-873-9842. Tinky-Winky has the weirdest name but" +
                "the best color, purple. Finally you find Laa-Laa's Phone:(407)-398-8062. If you need to get a hold of the sun," +
                "you'll have to call her phone:(910)-460-9504.";
        extractPhoneNumber(phonebook1);
        extractSecondNumber(phonebook);
        extractMultipleNumbers(phonebook);
    }

    public void example1() {
        String word = "Unicorn";
        //print the index of the letter c
        int start = word.indexOf("c");
        System.out.println(start); // or: System.out.println(word.indexOf("c"));
        System.out.println(word.substring(start));
        int end = word.indexOf("o") + 1;
        System.out.println(word.substring(start, end));

        System.out.println(word.contains("u"));
        System.out.println(word.indexOf("u")); // this returns -1 because lowercase u is not in the word Unicorn
        String lowerWord = word.toLowerCase();
        System.out.println(lowerWord.contains("u"));
        System.out.println(lowerWord.indexOf("u"));
    }

    public void extractPhoneNumber(String text) { // output: Phone: (231)-407-4553
        int start = text.indexOf("P");
        System.out.println(start);
        System.out.println(text.substring(start));
    }

    public void extractSecondNumber(String text) {
        int phoneNumIndex = text.indexOf("Phone:"); //int of the original phone number index
        int secondPhoneIndex = text.indexOf("Phone:", phoneNumIndex); // int of the phone number index after the og index
        int endIndex = text.indexOf(".", secondPhoneIndex);
        System.out.println(text.substring(secondPhoneIndex, endIndex));
    }

    public void extractMultipleNumbers(String text){
        // use a while loop to find adn print all the phone number
        text = text.toLowerCase();
        int start = text.indexOf("phone:");
        int end = text.indexOf(". ", start);
        while (end > 0 && start > 0){
            System.out.println(text.substring(start, end));
            start = text.indexOf("phone:", start+10);
            end = text.indexOf(". ", start);
        }
    }

}


/**
 * Methods:
 * .indexOf(String s) - Find the position of a specific character or substring
 * .substring(int beginIndex, int endIndex) - Extract a substring based on specified start and end indices
 * .contains(String s) - Check if a string contains a specified sequence of characters
 * .toLowerCase() and .toUpperCase() - Transform the string to all lowercase or uppercase
 * */