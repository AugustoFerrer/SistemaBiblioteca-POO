import java.util.ArrayList;
import java.util.List;

public class Usuario {
    
    private String nome;
    private int matricula;
    private List<Emprestimo> emprestimos = new ArrayList<>();

    //CONSTRUTOR
    public Usuario(String nome, int matricula){
        this.nome = nome;
        this.matricula = matricula;
        //falta saber se a lista de emprestimos ja ta criada e vazia pronta pra add as coisas
    }


}
