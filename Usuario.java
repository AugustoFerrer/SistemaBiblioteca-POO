import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private final String nome;
    private final int matricula;
    private final int limiteEmprestimos; 
    private List<Emprestimo> emprestimos;
    
    //CONSTRUTOR FOCANDO AS INICIALIZAÇÕES NELE
    public Usuario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        this.limiteEmprestimos = 3;
        this.emprestimos = new ArrayList<>();
    }

    // public ... PegarEmprestado(Livro livro){


    // }



}
