package com.calculator;

import java.math.BigDecimal;

public abstract class BinaryOperator implements Operator {
    public void operate(OperandStack operands) {
        BigDecimal firstOperand = operands.peek();
        operands.pop();
        BigDecimal secondOperand = operands.peek();
        BigDecimal result = getResult(firstOperand, secondOperand);
        operands.replaceTop(result);
    }

    protected abstract BigDecimal getResult(BigDecimal firstOperand, BigDecimal secondOperand);
}
