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

        //Displaying domain, codomain, and relation
        displaySet(domain, 0);
        displaySet(codomain, 1);
        displayRelation(relation);

        //Looping through to see if any elements of the domain are used more than once
        int[] domainCounter = new int[domain.length];

        for(int i = 0; i < domain.length; i++){
            int counter = 0;
            for(int j = 0; j < relation.length; j+=2){
                if(domain[i].equals(relation[j])){
                    counter++;
                    //System.out.println(Arrays.toString(domainCounter));
                }
                domainCounter[i] = counter;
            }
        }
        System.out.println(Arrays.toString(domainCounter));

        //Looping through to see how many times the elements of the codomain are used (can be used 0 times)

        int[] codomainCounter = new int[codomain.length];

        for(int i = 0; i < codomain.length; i++){
            int counter = 0;
            for(int j = 1; j < relation.length; j+=2){
                if(codomain[i].equals(relation[j])){
                    counter++;
                }
                codomainCounter[i] = counter;
            }
        }
        System.out.println(Arrays.toString(codomainCounter));


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
        //Displaying domain or codomain
        System.out.println(displayOutput);
    }

    public static void displayRelation(String[] relInput){
        String relOutput = "RELATION: { ";
        //Looping to add to relOutput string
        for(int i = 0; i < relInput.length; i +=2){
            if(i != relInput.length-2) {
                relOutput += "(" + relInput[i] + "," + relInput[i+1] + "), ";
            }
            else{
                relOutput += "(" + relInput[i] + "," + relInput[i+1] + ") }";
            }
        }
        //Displaying relations
        System.out.println(relOutput);

    }

}
