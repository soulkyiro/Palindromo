package palindromos;

class Decimal extends Palindromo{
    
      public boolean palindromo(int numero, int base){
         return esPalindromo(Integer.toString(numero));
     }
}