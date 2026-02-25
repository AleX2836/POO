package ProjetoConta;

import java.util.Scanner;

public class ContaTeste {

    public Conta cc = new Conta();
    public Scanner teclado = new Scanner(System.in);

    public void execSacar(){

        String valor;

        System.out.println("----------------------------------------------------");
        System.out.println("Digite o valor a ser sacado: ");
        valor =  teclado.nextLine();

        double x = Double.parseDouble(valor);

        int resultado = cc.sacar(x);

        if(resultado == 1){
            System.out.println("Saque realizado");
        }else{
            System.out.println("Saque não realizado !");
        }

        System.out.println("----------------------------------------------------");

    }

        public void execDepositar(){

            String valor;


            System.out.println("----------------------------------------------------");
            System.out.println("Digite o valor a ser depositado: ");
            valor = teclado.nextLine();

            double x = Double.parseDouble(valor);

            cc.depositar(x);

            System.out.println(cc.saldo);

            System.out.println("Deposito realizado !");

            System.out.println("----------------------------------------------------");

        }

        public void execConsultar(){


            System.out.println("----------------------------------------------------");
            cc.imprimir();
            
            System.out.println("----------------------------------------------------");
        }

        public void execCadastrar(){


        System.out.println("----------------------------------------------------");
            System.out.println(" -- Cadastro --");

            System.out.println("Digite o seu nome: ");
            cc.nomeCliente = teclado.nextLine();

            System.out.println("Digite qual a sua agencia: ");
            cc.agencia = teclado.nextLine();

            System.out.println("Digite qual a sua conta: ");
            cc.conta = teclado.nextLine();

            System.out.println("Cadastro realizado");


        System.out.println("----------------------------------------------------");
        }
    
    
    public static void main(String[] args) {

        ContaTeste teste = new ContaTeste();


        int op = 0;

        do {

            System.out.println("## Bem vindo ao sistema Bancario ##");
            System.out.println("--------------  Menu -----------");
            System.out.println("Opção 1 --> Cadastrar");
            System.out.println("Opção 2 --> Sacar");
            System.out.println("Opção 3 --> Depositar");
            System.out.println("Opção 4 --> Consultar");
            System.out.println("Opção 9 --> Sair");
            System.out.println("Escolha uma das opções acima: ");

            op = Integer.parseInt(teste.teclado.nextLine());

            switch (op) {
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execSacar();
                    break;
                case 3:
                    teste.execDepositar();
                    break;
                case 4:
                    teste.execConsultar();
                    break;
                case 9:
                    System.out.println("Sistema enecerrado !");
                    break;
                default:
                    System.out.println("Opção invalida");
            }
            
        } while (op != 9);

    }
    
}
            
        
        
    

