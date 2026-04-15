import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import model.Question;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<Question>> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("""
                    ENTER :
                    VC : VIEW CATEGORY
                    VS : VIEW SCORE
                    E : EXIT

                            """);
            System.out.print("YOUR CHOICE : ");
            String choice = sc.nextLine().toLowerCase();

            switch (choice) {
                case "vc":
                    model.Category.selectCategory(sc, map);

                    break;

                case "vs":

                    System.out.println("YOU SCORE : " + model.Category.calculateScore() + "/10");

                    break;

                case "e":
                    System.out.println("<<<<<<<<EXITING PROGRAM>>>>>>>>");
                    System.exit(0);

                    break;
                default:
                    break;
            }
        }

    }
}
