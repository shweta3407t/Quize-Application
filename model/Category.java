package model;

import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Category {
    public static void selectCategory(Scanner sc, HashMap<String, List<Question>> map) {

        while (true) {
            System.out.println("""
                    CATEGORY :
                    J : JAVA
                    S : SCIENCE
                    GK : GENERAL KNOWLEDGE
                    r : RETURN CATEGORY
                    """);
            System.out.print("SELECT CATEGORY : ");
            String category = sc.nextLine().toLowerCase();

            boolean isValide = utils.InputValidator.isCharacter(category);

            if (isValide) {
                System.out.println("ERROR : CHOICE SHOULD BE IN CHARACTER");
                continue;
            }
            HashMap<String, List<Question>> storeQuestion = service.QuizeService.loadQuestion();

            switch (category) {
                case "j":

                    List<Question> javaQuestions = storeQuestion.get("java");
                    printQuestions(sc, javaQuestions);
                    return;

                case "s":
                    List<Question> sciencQuestions = storeQuestion.get("science");
                    printQuestions(sc, sciencQuestions);
                    return;
                case "gk":
                    List<Question> gkQuestions = storeQuestion.get("gk");
                    printQuestions(sc, gkQuestions);
                    return;

                case "r":

                    return;
                case "e":
                    System.exit(0);

                default:
                    System.out.println("--------INVALIDE OPTION SELECTED-----");
                    break;
            }

        }

    }

    static int score = 0;

    private static void printQuestions(Scanner sc, List<Question> question) {
        score = 0;
         boolean isRunning = true;
            while (isRunning) {

        for (int i = 0; i < question.size(); i++) {
            Question q = question.get(i);
            System.out.println(q.getQuestion());

            HashMap<String, String> opts = q.getOption();
            opts.forEach((opt, value) -> {
                System.out.println(opt + " : " + value);
            });
            

                System.out.print("\n ANSWER (ENTER ANSWER IN a,b,c,d) : ");
                String ans = sc.nextLine();

                boolean isValide = utils.InputValidator.isValideAns(ans);
                if (!isValide) {

                    continue;
                }
                isRunning = false;

                String corrans = q.getCorrAns();
                if (ans.matches(corrans)) {

                    score += 1;
                    System.out.println("\n ✅ CORRECT ANSWER .\n ");

                } else {
                    System.out.println("\n ❌ Wrong! ✅ Correct answer : " + corrans + "\n");

                }

            }

        }
        System.out.println("---------QUIZE END--------\n");
    }

    public static int calculateScore() {
        return score;
    }

}
