package palindromos;

class Hexadecimal extends Palindromo{
    
      public boolean palindromo(int numero, int base){
         return esPalindromo(Integer.toHexString(numero));
     }
}