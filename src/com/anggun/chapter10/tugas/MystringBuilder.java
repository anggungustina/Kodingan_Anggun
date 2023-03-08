package com.anggun.chapter10.tugas;

public class MystringBuilder {
    private String s;

    public MystringBuilder(String s) {
        this.s = s;
    }
    public MystringBuilder append(MystringBuilder s) {
        String newStr = this.s;
        newStr += s;
        return new MystringBuilder(newStr);

    }
    public MystringBuilder append(int i) {
        String newStr = this.s;
        newStr += i + "";
        return new MystringBuilder(newStr);
    }
    public int length(){
        return s.length();
    }
    public char charAt(int index) {
        return s.charAt(index);
    }
    public MystringBuilder toLowercase() {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                newStr += (char)(s.charAt(i) + 32) + "";
            }
        }
        return new MystringBuilder(newStr);
    }
    public MystringBuilder substring(int begin, int end){
        String newStr = "";
        for (int i = begin; i < end; i++){
            newStr += s.charAt(i) + "";
        }
        return new MystringBuilder(newStr);
    }
    public String toString() {
        return s;
    }
}
