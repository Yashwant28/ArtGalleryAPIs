package com.art.gallery.dao;

import com.art.gallery.model.CalcAnswer;
import com.art.gallery.model.CalcInputs;
import com.art.gallery.model.StatusMessages;

import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class CalculatorRepository {

    private CalcInputs globalCalcInputs;

    public StatusMessages getInputValues(CalcInputs calcInputs) {
        this.globalCalcInputs = calcInputs;
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Data Saved Successfully!!");
        return statusMessages;
    }

    public CalcAnswer getAddition() {
        CalcAnswer calcAnswer = new CalcAnswer();

        Float answer = globalCalcInputs.getFirstNumber() + globalCalcInputs.getSecondNumber();
        calcAnswer.setAnswer(answer);
        return calcAnswer;
    }

    public StatusMessages updateInputValues(CalcInputs calcInputs) {
        this.globalCalcInputs = calcInputs;
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Data Updated Successfully!!");
        return statusMessages;
    }

    public StatusMessages deleteInputValues() {
        this.globalCalcInputs = null;
        StatusMessages statusMessages = new StatusMessages();
        statusMessages.setMessage("Data Deleted Successfully!!");
        return statusMessages;
    }
}
