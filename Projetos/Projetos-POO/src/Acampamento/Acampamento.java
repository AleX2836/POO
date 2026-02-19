package Acampamento;
public class Acampamento {

    String nome = " ";
    char equipe = ' ';
    int idade = 0;


  public void separarGrupo(){

        if(idade >= 6 && idade <= 10){
            equipe = 'A';
        }else if(idade >= 11 && idade <= 20){
            equipe = 'B';
        }else if(idade > 21){
            equipe = 'C';
        }
  }

    public void imprimir(){

        System.out.println("O nome é: " + nome);
        System.out.println("Essa é a equipe: "+ equipe);
        System.out.println("A idade é: " + idade);
    }      
}
