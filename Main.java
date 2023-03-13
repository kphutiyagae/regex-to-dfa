import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    try{
    
        Regex regexObject = new Regex();

        regexObject.runProgram();

    } catch (Exception e) {
        System.out.println("An error occured, please retry running the program.");
        System.out.println("Error: " + e);
    }
    }
}