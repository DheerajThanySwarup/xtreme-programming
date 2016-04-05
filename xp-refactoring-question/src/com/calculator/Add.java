package com.calculator;

import java.math.BigDecimal;

public class Add implements Operator {
    @Override
    public void operate(OperandStack operands) {
        BigDecimal firstOperand = operands.peek();
        operands.pop();
        BigDecimal secondOperand = operands.peek();
        BigDecimal result = firstOperand.add(secondOperand);
        operands.replaceTop(result);
    }
}
