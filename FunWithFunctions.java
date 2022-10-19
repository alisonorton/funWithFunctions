import java.util.Arrays;
import java.util.Scanner;

public class FunWithFunctions {
    public static void main(String[] args){
        //Scanner to read in data
        var s = new Scanner(System.in);
        String input;

        input = s.nextLine();
        String[] domain = input.split(" ");
        input = s.nextLine();
        String[] codomain = input.split(" ");

        System.out.println(Arrays.toString(domain));
        System.out.println(Arrays.toString(codomain));

        //Logic to determine if it is a function, and if so what type

        //Displaying
    }

}
