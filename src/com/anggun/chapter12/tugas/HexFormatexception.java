package com.anggun.chapter12.tugas;

public class HexFormatexception extends NumberFormatException{
    private String hex;

    public HexFormatexception(String hex){
        super(hex + " is not a hex string");
        this.hex = hex;
    }
    public String getHex(){
        return hex;
    }
}
