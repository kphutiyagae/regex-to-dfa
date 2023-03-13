import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {

    private String regexString;
    private char [] tokenizedRegexStr;
    private Pattern regexPattern;

    public void runProgram() {

        Scanner userRegexInput = new Scanner(System.in);

        System.out.println("Please enter a valid regex string: ");

        regexString = userRegexInput.nextLine();

        // 1. Validate regex string if valid.
        boolean stringIsRegex = isValidRegex(regexString);

        // 2.Tokenize string
        if (stringIsRegex) {
            tokenizedRegexStr = regexString.toCharArray();


        }

    }

    public boolean isValidRegex(String regexStr) {
        try {
            if (regexStr == null)
                return false;
            else {
                Pattern regexPatternCompile = Pattern.compile(regexString);
                regexPattern = regexPatternCompile;
                return true;
            }
        } catch (Exception e) {
            System.out.println("The given regex pattern: " + regexStr + " is not valid Regex.");
            return false;
        }

    }

    public void compositionalRegexToNFA (String [] regexTokens){
        if(regexTokens == null){
            return;
        } else {
            
        }

    }


}
