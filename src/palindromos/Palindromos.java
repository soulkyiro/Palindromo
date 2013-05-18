package palindromos;

import java.lang.*;

public class Palindromos{

    public int Base(int base){
        int b[] = {2,8,10,16};
        for(int i=0; i<5;i++)
           if(base==b[i])
               return base
    }

    public boolean Base2(int base){
        if(base == 2)
    }
    public boolean Base8(int base){
        if(base == 8)
    }
    public boolean Base10(int base){
        if(base == 10)
    }
    public boolean Base16(int base){
        if(base == 16)
    }
    
    public boolean palindromo(int numero, int base) {
        boolean esPalindromo = false;
        switch (base) {
            case 2:
                esPalindromo = esPalindromo(Integer.toBinaryString(numero));
                break;
            case 8:
                esPalindromo = esPalindromo(Integer.toOctalString(numero));
                break;
            case 10:
                esPalindromo = esPalindromo(Integer.toString(numero));
                break;
            case 16:
                esPalindromo = esPalindromo(Integer.toHexString(numero));
                break;
            default:
                esPalindromo = false;
        }
        return esPalindromo;

    }

}
