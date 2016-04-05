package com.calculator;

import java.math.BigDecimal;

public class Calculator {

    public static void main(String[] args) {
        OperandStack operands = new OperandStack();
        operands.push(new BigDecimal(100));
        operands.push(new BigDecimal(300));
        char operatorChar = '+';
        Operator operator;
        operator = getOperator(operatorChar);
        operator.operate(operands);
        System.out.println("Result is "+operands.peek().toString());
    }

    private static Operator getOperator(char operatorChar) {
        switch(operatorChar){
            case '+':
                return new Add();
            case '-':
                return new Substract();
            default:
                return null;
        }
    }
}
