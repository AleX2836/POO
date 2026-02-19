package ProjetoComputador;

public class Computador {

    String marca = " ";
    String cor = " ";
    String modelo = " ";
    long numeroSerie;
    double preco;



    public void imprimir(){
        System.out.println("Marca: " + marca);
        System.out.println("Cor: " + cor);
        System.out.println("Modelo: " + modelo);
        System.out.println("Numero de serie: " + numeroSerie);
        System.out.println("Preço: " + preco);
    }
    
    public void calcularValor(){
        if(marca.equals("HP") || marca.equals("hp")){         // O == compara apenas tipos primitivos, para String usa o .equals
            preco = preco * 1.30;
        }else if(marca.equals("IBM") || marca.equals("ibm")){
            preco = preco * 1.50;
        }
    }

    public double alterarValor(double novopreco){

        if(novopreco > 0){
            this.preco = novopreco;
            System.out.println("Valor alterado");

            return 1;
        }else{ 
        System.out.println("Valor não alterado");
        return 0;
        }        
     
    }  
}
