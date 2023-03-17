package com.anggun.chapter12.tugas;

public class Ex8_HexFormatException extends NumberFormatException{
    private String hex;

    public Ex8_HexFormatException(String hex){
        super(hex + " is not a hex string");
        this.hex = hex;
    }
    public String getHex(){
        return hex;
    }
}
