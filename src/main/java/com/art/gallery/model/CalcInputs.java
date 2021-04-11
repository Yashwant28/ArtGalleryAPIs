package com.art.gallery.model;

import javax.validation.constraints.NotNull;

public class CalcInputs {

    @NotNull
    private Float firstNumber;
    @NotNull
    private Float secondNumber;

    public Float getFirstNumber() {
        return this.firstNumber;
    }

    public Float getSecondNumber() {
        return this.secondNumber;
    }

    public void setSecondNumber(Float secondNumber) {
        this.secondNumber = secondNumber;
    }

    public void setFirstNumber(Float firstNumber) {
        this.firstNumber = firstNumber;
    }
}
