import javax.swing.text.html.Option;
import java.util.*;

public class Util {


    public static List<Integer> number1 = new ArrayList<>();
    public static List<Integer> number2 = new ArrayList<>();
    public static List<String> operators = new ArrayList<>();
    public static void setQuestion(String message){
        System.out.println(message);
    }
    public static int calculator(int number1,String operator,int number2){
        int result = 0;
        if (operator.equals("+")){
            result = number1 + number2;
        } else if (operator.equals("-")) {
            result = number1 - number2;
        } else if (operator.equals("*")) {
            result = number1 * number2;
        } else if (operator.equals("/")) {
            result = number1 / number2;
        } else if (operator.equals("%")) {
            result = number1 % number2;
        }else {
            setQuestion("Operator : "+operator+" is invalid!");
        }
        return result;

    }


    public static void log(){
        for (int i = 0; i<number1.size();i++){
            int result = calculator(number1.get(i),operators.get(i),number2.get(i));
            System.out.printf("%3d %3s %3d",number1.get(i),operators.get(i),number2.get(i));
            System.out.println(" = "+result);
        }
    }
}
