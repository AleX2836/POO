package Aluno;


public class AlunoTeste {

    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();
        Aluno aluno2 = new Aluno();

        aluno1.nome = "Alex";
        aluno1.ra = 202020;
        aluno1.email = "Alex@gmail.com";
        aluno1.turma = "Turma 1";

        aluno1.matricular();

        aluno2.email = "Joao@";
        aluno2.nome = "joao";
        aluno2.ra = 7272;
        aluno2.turma = "Turma 4";

        aluno2.matricular();

        aluno2.cancelarMatricula();

    }
    
}
