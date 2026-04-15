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
                r : RETURN CATEGORY
                """);
        System.out.print("SELECT CATEGORY : ");
        String category = sc.nextLine().toLowerCase();
        HashMap<String, List<Question>> storeQuestion = service.QuizeService.loadQuestion();

        switch (category) {
            case "j":

                List<Question> javaQuestions = storeQuestion.get("java");
                printQuestions(sc, javaQuestions);
                break;
            case "s":
                List<Question> sciencQuestions = storeQuestion.get("science");
                printQuestions(sc, sciencQuestions);
                break;
            case "gk":
                List<Question> gkQuestions = storeQuestion.get("gk");
                printQuestions(sc, gkQuestions);
                break;

            case "r":

                return;
            case "e":
                System.exit(0);

            default:
                System.out.println("--------INVALIDE OPTION SELECTED-----");
                break;
        }

    }

    static int score = 0;

    private static void printQuestions(Scanner sc, List<Question> question) {
        score = 0;
        for (int i = 0; i < question.size(); i++) {
            Question q = question.get(i);
            System.out.println(q.getQuestion());

            HashMap<String, String> opts = q.getOption();
            opts.forEach((opt, value) -> {
                System.out.println(opt + " : " + value);
            });

            System.out.print("\n ANSWER (ENTER ANSWER IN a,b,c,d) : ");
            String ans = sc.nextLine();

            String corrans = q.getCorrAns();
            if (ans.matches(corrans)) {

                score += 1;
                System.out.println("\n ✅ CORRECT ANSWER . ");
                System.out.println("score : " + score);

            } else {
                System.out.println("\n ❌ Wrong! ✅ Correct answer : ");
                System.out.println("score : " + score);

            }

            model.Category.calculateScore();
        }

    }

    public static int calculateScore() {
        return score;
    }

}
