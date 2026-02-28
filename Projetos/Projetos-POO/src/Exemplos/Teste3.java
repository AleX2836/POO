package Exemplos;

public class Teste3 {

    /**
     * Função soamr realiza a soma de dois valores inteiros
     * @param a Primeiro valor inteiro informado
     * @param b Segundo valor inteirto informado
     * @return Soma dos dois valores passados como argumento
     */

    // sem o void = funçao com void =  medoto
    public static int somar (int a, int b){
        return a + b;
    }

    
    public static void main(String[] args) {

        int resultado = somar(5, 03);
        System.out.println(resultado);     
    }
}
