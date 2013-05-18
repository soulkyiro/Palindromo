package palindromos;

 class Binario extends Palindromo{
      public boolean palindromo(int numero, int base){
         return esPalindromo(Integer.toBinaryString(numero));
     }
}