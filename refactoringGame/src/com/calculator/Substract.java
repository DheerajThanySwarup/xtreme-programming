package com.calculator;

import java.math.BigDecimal;

public class Substract extends BinaryOperator{

    @Override
    protected BigDecimal getResult(BigDecimal firstOperand, BigDecimal secondOperand) {
        return firstOperand.subtract(secondOperand);
    }
}
