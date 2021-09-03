  import java.util.Scanner;


public class MadLib{


    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        String Noun1;
        String Noun2;
        String Noun3;
        String occupation;
        String verb;


        System.out.println("Enter a noun");
        Noun1 = read.nextLine();
        System.out.println("Enter another noun ");
        Noun2 = read.nextLine();
        System.out.println("Enter one last noun ");
        Noun3 = read.nextLine();
        System.out.println("Enter an occupation ");
        occupation = read.nextLine();
        System.out.println("Enter a verb");
        verb = read.nextLine();

        System.out.println("It was during the battle of " + Noun1 + " When i was running through a " + Noun2 + " When a " + Noun3 + " went off right next to my platoon. our " + occupation + " yelled for us to " + verb);











    }

}