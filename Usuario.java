import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String nome;
    private int matricula;
    private List<Emprestimo> emprestimos = new ArrayList<>();
    private int limiteEmprestimos = 3; 

    //CONSTRUTOR
    public Usuario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
    }

    

}
