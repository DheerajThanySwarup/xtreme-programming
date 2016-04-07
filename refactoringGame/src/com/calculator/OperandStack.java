package com.calculator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OperandStack {

    List<BigDecimal> operands;

    public OperandStack() {
        this.operands = new ArrayList<>();
    }

    public void push(BigDecimal operand){
        this.operands.add(operand);
    }

    public BigDecimal peek(){
        return this.operands.get(this.operands.size()-1);
    }

    public BigDecimal pop(){
        BigDecimal temp =  peek();
        this.operands.remove(this.operands.size()-1);
        return temp;
    }

    public void replaceTop(BigDecimal newTop){
        pop();
        this.push(newTop);
    }
}
