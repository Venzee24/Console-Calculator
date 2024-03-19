import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


     Main m  = new Main();
     m.runner();

    }
    public boolean exit(){
        Util.setQuestion("EXIT(y/n) : ");
        String result = scanner.nextLine();
        if (result.equalsIgnoreCase("y")){
            return false;
        }
        else if (result.equalsIgnoreCase("n")){
            return true;
        }else {
            Util.setQuestion("Please Enter Y/N");
            exit();
        }
        return true;
    }
    public void runner(){
        boolean running = true;
        while (running) {
            getNumber1();
            getOperator();
            getNumber2();
            Util.log();
            running=exit();
        }
    }
    public void getNumber1(){
        Util.setQuestion("Number1 : ");
        String inputValue = scanner.nextLine();
        Integer firstNumber = Integer.valueOf(inputValue);
        Util.number1.add(firstNumber);
    }
    public void getOperator(){
        Util.setQuestion("Operator : ");
        String inputValue = scanner.nextLine();
        if (inputValue.equals("+")){
            Util.operators.add(inputValue);
        } else if (inputValue.equals("-")){
            Util.operators.add(inputValue);
        } else if (inputValue.equals("*")) {
            Util.operators.add(inputValue);
        } else if (inputValue.equals("/")) {
            Util.operators.add(inputValue);
        } else {
            Util.setQuestion("Operator "+inputValue+" is invalid");
            getOperator();
        }


    }
    public void getNumber2(){
        Util.setQuestion("Number2 : ");
        String inputValue = scanner.nextLine();
        Integer secondNumber = Integer.valueOf(inputValue);
        Util.number2.add(secondNumber);
    }



    //accessModifier | static 0r instance | return Type | methodName | () | {}

}