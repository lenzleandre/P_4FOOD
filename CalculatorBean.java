/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EJBeans;

import Entities.Calculation;
import javax.ejb.Stateless;

/**
 *
 * @author mcamelo
 */
@Stateless
public class CalculatorBean {
    private int num1;
    private int num2;
    private int result;
    private String operator;

    public CalculatorBean() {
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
    public CalculatorBean (int num1, int num2, String operator){
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }
    public Calculation doCalculation(){
        switch (operator) {
            case "Add":
                result = num1 + num2;
                operator = "Addition";
                break;
            case "Sub":
                result = num1 - num2;
                operator = "Subtraction";
                break;
            case "mul":
                result = num1 * num2;
                operator = "Multiplication";
                break;
            case "div":
                result = num1 / num2;
                operator = "Division";
                break;
            default:
                break;
        } 
        return (new Calculation(num1, num2, result, operator));
    }

    public int getResult() {
        return result;
    }

    public String getOperationName() {
        return operator;  
    }
 
    
}
