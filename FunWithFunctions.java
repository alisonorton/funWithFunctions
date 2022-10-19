import java.util.Arrays;
import java.util.Scanner;

public class FunWithFunctions {
    public static void main(String[] args) {
        //Scanner to read in data
        var s = new Scanner(System.in);
        String input;

        input = s.nextLine();
        String[] domain = input.split(" ");
        input = s.nextLine();
        String[] codomain = input.split(" ");
        input = s.nextLine();
        String[] relation = input.split(" ");

        //Turing the domain array into a string, so we can display it easily
        displaySet(domain, 0);
        displaySet(codomain, 1);
        displayRelation(relation);

        //Logic to determine if it is a function, and if so what type

        //Displaying
    }

    public static void displaySet(String[] setInput, int setType){
        //If setType = 0 it's the domain
        //If setType = 1 it's the codomain

        String displayOutput = "";
        if(setType == 0){
            displayOutput = "DOMAIN: { ";
        }
        else{
            displayOutput = "CODOMAIN: { ";
        }

        for(int i = 0; i < setInput.length; i++){
            if(i != setInput.length-1){
                displayOutput += setInput[i] + ", ";
            }
            else{
                displayOutput += setInput[i] + " }";
            }
        }

        System.out.println(displayOutput);
    }

    public static void displayRelation(String[] relInput){
        String relOutput = "RELATION: { ";

        for(int i = 0; i < relInput.length; i +=2){
            if(i != relInput.length-2) {
                relOutput += "(" + relInput[i] + "," + relInput[i+1] + "), ";
            }
            else{
                relOutput += "(" + relInput[i] + "," + relInput[i+1] + ") }";
            }
        }

        System.out.println(relOutput);

    }

}
