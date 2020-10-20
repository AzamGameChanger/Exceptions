package com.Practicewithazam.exceptions;

//Checked -> Exception
//Unchecked (runtime) -> RuntimeException

public class InsufficientFundsException extends Exception  {

    public InsufficientFundsException(){
        super("Insufficient amount in your balance.");
    }

    public InsufficientFundsException(String message){
        super(message);
    }
}
