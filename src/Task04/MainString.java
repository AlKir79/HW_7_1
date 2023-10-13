package Task04;

import java.util.Arrays;

public class MainString {
    private char[] arrChar;
    private int size;

    public MainString() {
    }

    public MainString(String arrStr) {
    this.arrChar = arrStr.toCharArray();
    this.size = arrStr.length();
    }

    public MainString(char symb){
        this.arrChar[this.arrChar.length+1] = symb;
        this.size = arrChar.length+1;
    }

    public int getSize() {
        return arrChar.length;
    }

    public void nulArr(){
        for (int i=0;i< this.arrChar.length;i++) this.arrChar[i] = 0;
    }

    public boolean findSymb(char symb){
        for (int i=0;i< arrChar.length;i++){
            if  (arrChar[i]==symb){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String temp = "";
        for (int i=0;i<arrChar.length;i++){
            temp+=arrChar[i];
        }
        return temp;
    }
}
