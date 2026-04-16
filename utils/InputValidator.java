package utils;

public class InputValidator {

    public static boolean isCharacter(String choice) {
        if (choice.matches("\\d+")) {
            return true;
        }
        return false;
    }

    public static boolean  isValideAns(String ans) {
        if (ans.isEmpty()) {
            System.out.println("ERROR : EMPTY ANSWER ");

            return false;
        }
        if(!ans.matches( "a") &&  !ans.matches( "b") && !ans.matches( "c") && !ans.matches( "d")){
            System.out.println("INVALIDE OPTION SELECTED.");
            return false;
        }

        return false;

    }
}
