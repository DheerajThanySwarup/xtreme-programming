package com.calculator;

import java.math.BigDecimal;

public class Add extends BinaryOperator {

    @Override
    protected BigDecimal getResult(BigDecimal firstOperand, BigDecimal secondOperand) {
        return firstOperand.add(secondOperand);
    }
}
