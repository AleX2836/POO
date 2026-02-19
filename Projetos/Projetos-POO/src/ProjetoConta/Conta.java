package ProjetoConta;

public class Conta {

    String conta;
    String agencia;
    double saldo = 200;
    String nomeCliente;
   
    public int sacar (double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
             return 1;
        }else if(saldo == 0){
            System.out.println("Não a saldo para ser sacado");
        }
        return 0;
    }

    public void depositar(double depositarDinheiro){
            saldo = saldo + depositarDinheiro;
    }

    public void imprimir(){

        System.out.println("Conta: " + conta);
        System.out.println("Agencia: " + agencia);
        System.out.println("Saldo: " + saldo);
        System.out.println("Nome: " + nomeCliente);
    }
    
}
