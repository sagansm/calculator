package me.ssagan.demo;

import me.ssagan.service.Calculator;
import me.ssagan.service.ConsoleWriter;

public class _Main {
    public static void main(String args[]){
        String xStr = args[0];
        String yStr = args[1];

        int y = Integer.parseInt(yStr);
        int x = Integer.parseInt(xStr);

        int result = Calculator.sum(x,y);
        ConsoleWriter.displayResult(x, y, result, "+");

        result = Calculator.multiply(x,y);
        ConsoleWriter.displayResult(x, y, result, "*");

        result = Calculator.subtract(x,y);
        ConsoleWriter.displayResult(x, y, result, "-");

    }
}
