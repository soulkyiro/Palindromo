package palindromos;

public abstract class Palindromo {

    public boolean esPalindromo(String cadena) {
         int indiceInverso = cadena.length();

        for (int i = 0; i < (cadena.length()); i++) {
            if (sonIgualesPrimeraYultima(cadena, i, indiceInverso))
                return false;
            indiceInverso--;
        }
        return true;
    }

    private boolean sonIgualesPrimeraYultima(String cadena, int i, int indiceInverso) {
         return cadena.substring(i, i + 1).equals(cadena.substring(indiceInverso - 1, indiceInverso)) == false;
    }

    public abstract boolean palindromo(int numero, int base);
}