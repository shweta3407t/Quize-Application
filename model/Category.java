package model;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Category {
    public static void selectCategory(Scanner sc, HashMap<String, List<Question>> map) {
        System.out.println("""
                CATEGORY :
                J : JAVA
                S : SCIENCE
                GK : GENERAL KNOWLEDGE
                """);
        System.out.print("SELECT CATEGORY : ");
        String category = sc.nextLine().toLowerCase();
        HashMap<String, List<Question>> storeQuestion = service.QuizeService.loadQuestion();
        List<Question> javaQuestions = storeQuestion.get("java");

        switch (category) {
            case "j":
                for (int i = 0; i < javaQuestions.size(); i++) {
                    Question q = javaQuestions.get(i);

                    System.out.println(q.getQuestion());

                    HashMap<String, String> opts = q.getOption();

                    opts.forEach((opt, value) -> {
                        System.out.println(opt +  ": " + value);
                    });

                    System.out.print("YOUR ANSWER : ");
                    String ans = sc.nextLine();

                    String corrAns = q.getCorrAns();

                    if (ans.matches(corrAns)) {
                        System.out.println("✅ CORRECT ANSWER .");
                    } else {
                        System.out.println("❌ Wrong! ✅ Correct answer: " + corrAns);
                    }

                }

                break;
            case "s":

                break;
            case "gk":

                break;
            case "e":
                System.exit(0);

            default:
                System.out.println("--------INVALIDE OPTION SELECTED-----");
                break;
        }

    }
}
