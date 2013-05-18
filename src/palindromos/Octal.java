package palindromos;

class Octal extends Palindromo{
    
      public boolean palindromo(int numero, int base){
         return esPalindromo(Integer.toOctalString(numero));
     }
}