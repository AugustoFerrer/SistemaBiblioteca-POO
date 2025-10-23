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

    //METODOS DE USUARIO

    //SE LISTA DE EMPRESTIMOS FOR MAIOR OU IGUAL A 3, NAO FAZ NADA, CASO SEJA MENOR, ADICIONA NA LISTA 
    public boolean addEmprestimo(Emprestimo e){
        if (!this.podePegarEmprestado()) return false; 
        emprestimos.add(e);
        return true;
    }

    public boolean removeEmprestimo(Emprestimo e){
        if (emprestimos.contains(e)) {
            emprestimos.remove(e);
            return true;
        }
        return false; // Não encontrou o empréstimo na lista
    }

    public boolean podePegarEmprestado(){
        return this.emprestimos.size() < getLimiteEmprestimos();
    }

    // GETTERS
    public String getNome(){
        return this.nome;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public int getLimiteEmprestimos(){
        return this.limiteEmprestimos;
    }

    public List<Emprestimo> getEmprestimos(){
        return this.emprestimos;
    }

}