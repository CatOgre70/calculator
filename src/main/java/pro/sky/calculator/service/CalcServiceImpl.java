package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{

    private final String error1 = " = Вы точно хотите провести эту операцию " +
                            "с двумя этими странными штуками? А это вообще законно?";
    private boolean parseError = false;

    private int parseString(String s){
        parseError = false;
        try{
            return Integer.parseInt(s);
        }catch(NumberFormatException e){
            parseError = true;
            return 0;
        }
    }

    @Override
    public String getPlus(String num1, String num2){
        int x = parseString(num1);
        if(parseError) {
            parseError = false;
            return num1 + " + " + num2 + error1;
        }
        int y = parseString(num2);
        if(parseError) {
            parseError = false;
            return num1 + " + " + num2 + error1;
        }
        return x + " + " + y + " = " + (x + y);
    }

    @Override
    public String getMinus(String num1, String num2){
        int x = parseString(num1);
        if(parseError) {
            parseError = false;
            return num1 + " - " + num2 + error1;
        }
        int y = parseString(num2);
        if(parseError) {
            parseError = false;
            return num1 + " - " + num2 + error1;
        }
        return x + " - " + y + " = " + (x - y);
    }

    @Override
    public String getMultiply(String num1, String num2){
        int x = parseString(num1);
        if(parseError) {
            parseError = false;
            return num1 + " * " + num2 + error1;
        }
        int y = parseString(num2);
        if(parseError) {
            parseError = false;
            return num1 + " * " + num2 + error1;
        }
        return x + " * " + y + " = " + (x * y);
    }

    @Override
    public String getDivide(String num1, String num2){
        int x = parseString(num1);
        if(parseError) {
            parseError = false;
            return num1 + " / " + num2 + error1;
        }
        int y = parseString(num2);
        if(parseError) {
            parseError = false;
            return num1 + " / " + num2 + error1;
        }

        if(y == 0)
            return num1 + " / " + num2 + " = Ой! Я поделила на ноль и улетаю в другую Вселенную! " +
                                         "Прощай, человечество!";

        return x + " / " + y + " = " + ((double)x / y);
    }

}
