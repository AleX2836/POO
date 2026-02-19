package Aluno;

public class Aluno {

    public int ra;
    public String nome;
    public String email;
    public String turma;




    

    public void matricular(){
        System.out.println("Aluno: " + nome + " com o RA: " + ra + " Foi matriculado com sucesso!");
    }

    public void cancelarMatricula(){
        System.out.println("Aluno "+ nome + " sua matricula foi cancelada");


    }

    
}
