package pro.sky.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService{

    @Override
    public String getPlus(String num1, String num2){
        int x, y;
        try{
            x = Integer.parseInt(num1);
        }catch(NumberFormatException e){
            return num1 + " + " + num2 + " = Вы точно хотите провести эту операцию " +
                    "с двумя этими странными штуками? А это вообще законно?";
        }
        try{
            y = Integer.parseInt(num2);
        } catch(NumberFormatException e){
            return num1 + " + " + num2 + " = Вы точно хотите провести эту операцию " +
                    "с двумя этими странными штуками? А это вообще законно?";
        }
        String s = x + " + " + y + " = " + (x + y);
        return s;
    }

    @Override
    public String getMinus(String num1, String num2){
        int x, y;
        try{
            x = Integer.parseInt(num1);
        }catch(NumberFormatException e){
            return num1 + " - " + num2 + " = Вы точно хотите провести эту операцию " +
                    "с двумя этими странными штуками? А это вообще законно?";
        }
        try{
            y = Integer.parseInt(num2);
        } catch(NumberFormatException e){
            return num1 + " - " + num2 + " = Вы точно хотите провести эту операцию " +
                    "с двумя этими странными штуками? А это вообще законно?";
        }
        String s = x + " - " + y + " = " + (x - y);
        return s;
    }

    @Override
    public String getMultiply(String num1, String num2){
        int x, y;
        try{
            x = Integer.parseInt(num1);
        }catch(NumberFormatException e){
            return num1 + " * " + num2 + " = Вы точно хотите провести эту операцию " +
                    "с двумя этими странными штуками? А это вообще законно?";
        }
        try{
            y = Integer.parseInt(num2);
        } catch(NumberFormatException e){
            return num1 + " * " + num2 + " = Вы точно хотите провести эту операцию " +
                    "с двумя этими странными штуками? А это вообще законно?";
        }
        String s = x + " * " + y + " = " + (x * y);
        return s;
    }

    @Override
    public String getDivide(String num1, String num2){
        int x, y;
        try{
            x = Integer.parseInt(num1);
        }catch(NumberFormatException e){
            return num1 + " / " + num2 + " = Вы точно хотите провести эту операцию " +
                    "с двумя этими странными штуками? А это вообще законно?";
        }
        try{
            y = Integer.parseInt(num2);
        } catch(NumberFormatException e){
            return num1 + " / " + num2 + " = Вы точно хотите провести эту операцию " +
                    "с двумя этими странными штуками? А это вообще законно?";
        }

        if(y == 0)
            return num1 + " / " + num2 + " = Ой! Я поделила на ноль и улетаю в другую Вселенную! " +
                    "Прощай, недоразвитое человечество!";

        String s = x + " / " + y + " = " + ((double)x / y);
        return s;
    }



}
