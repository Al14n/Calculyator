package com.example.calculyator;

public class Model {

    public long calculyator(long a,long b, String operator) {
        switch (operator){
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if(b == 0 ) return 0;
                 return a / b;
        }
        return 0;
    }

}
