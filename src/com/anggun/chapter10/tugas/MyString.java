package com.anggun.chapter10.tugas;

public class MyString {
    private char[] chars;

    public MyString(char[] chars) {
        this.chars = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            this.chars[i] = chars[i];

        }
    }
    public char charAt(int index) {
        return  chars[index];
    }
    public int length() {
        return chars.length;
    }
    public MyString subsring(int begin, int end) {
        char[] ch = new char[end - begin];
        for (int i = begin, j = 0; i < end; i++, j++) {
            ch[j] = chars[i];
        }
        return new MyString(ch);
    }
    public MyString toLowercase(){
        char[] ch = new  char[chars.length];
        for (int i = 0; i < chars.length; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z')
                ch[i] = (char) (chars[i] + 32);
            else
                ch[i] = chars[i];
        }
        return new MyString(ch);
    }
    public boolean equals(MyString s) {
        if(chars.length != s.length())
            return false;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i] != s.charAt(i))
                return false;
        }
        return true;
    }
    public static MyString valueOf(int i) {
        int length = 0;
        int n = i;
        while (n >= 1) {
            n /= 10;
            length++;
        }
        char[] ch = new char[length];

        for(int j = 0, k = (int) Math.pow(10, length - 1);
        j < length; j++, k /= 10) {
            ch[j] = Character.forDigit((i / k), 10);
                i %= k;
            }
            return  new MyString(ch);

    }

}
