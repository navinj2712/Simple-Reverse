import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Scanner;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String word = scanner.next();
        String output = findSimpleReverse(word);
        System.out.println("Output : " + output);
    }

    private static String findSimpleReverse(String word) {
        String result = "";
        for (int i = word.length() - 1; i >=0; i--){
            result += word.charAt(i);
        }
        return result;
    }
}
