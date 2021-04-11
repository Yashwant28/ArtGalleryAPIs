package com.art.gallery.service;

import com.art.gallery.dao.CalculatorRepository;
import com.art.gallery.model.CalcAnswer;
import com.art.gallery.model.CalcInputs;
import com.art.gallery.model.StatusMessages;

import javax.inject.Inject;
import javax.inject.Named;
import javax.inject.Singleton;

@Named
@Singleton
public class CalculatorService {

    private CalculatorRepository calculatorRepository;

    @Inject
    public CalculatorService(CalculatorRepository calculatorRepository){
        this.calculatorRepository = calculatorRepository;
    }

    public StatusMessages getInputValues(CalcInputs calcInputs){
        return calculatorRepository.getInputValues(calcInputs);
    }

    public CalcAnswer getAddition() {
        return calculatorRepository.getAddition();
    }

    public StatusMessages updateInputValues(CalcInputs calcInputs) {
        return calculatorRepository.updateInputValues(calcInputs);
    }

    public StatusMessages deleteInputValues() {
        return calculatorRepository.deleteInputValues();
    }
}
