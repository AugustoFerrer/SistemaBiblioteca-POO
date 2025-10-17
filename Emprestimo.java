import java.time.LocalDate;

public class Emprestimo {
    
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataIni;
    private LocalDate dataEntregue;
    private LocalDate dataFim;
    // private int diasAtrasado;
    // private boolean atrasado;        ESSES ATRIBUTOS MUDAM COM O TEMPO
    // private boolean ativo;

    public Emprestimo(Usuario usuario, Livro livro){
        this.usuario = usuario;
        this.livro = livro;
        this.dataIni = LocalDate.now();
        this.dataEntregue = null;
        this.dataFim = dataIni.plusDays(14);
        // this.diasAtrasado = 0;
        // this.atrasado = false;
        // this.ativo = true;
    }

   

    //nao sei outras funcoes de emprestimo
    
    
    //GETTERS

    public Usuario getUsuario(){
        return this.usuario;
    }

    public Livro getLivro(){
        return this.livro;
    }

    public LocalDate getDataIni(){
        return this.dataIni;
    }

    public LocalDate getDataEntregue(){
        return this.dataEntregue;
    }

    public LocalDate getDataFim(){
        return this.dataFim;
    }

    // public boolean isAtrasado(){
    //     return this.atrasado;
    // }

    // public int getDiasAtrasado(){
    //     return this.diasAtrasado;
    // }
    
    // public boolean isAtivo(){
    //         return this.ativo;
    //     }
}
