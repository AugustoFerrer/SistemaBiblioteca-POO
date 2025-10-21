import java.time.LocalDate;

public class Emprestimo {
    
    private Usuario usuario;
    private Livro livro;
    private final double multaDiaria = 1.5;
    private LocalDate dataIni;
    private LocalDate dataEntregue;
    private LocalDate dataFim;
    // private int diasAtrasado;
    // private boolean atrasado;        ESSES ATRIBUTOS MUDAM COM O TEMPO
    // private boolean ativo;


    public Emprestimo(Usuario usuario, Livro livro){
        if (this.usuario == null) throw new IllegalArgumentException(); //se usuario for null, ja barra
        this.usuario = usuario;
        
        if (this.livro == null || this.livro.isDisponivel() == false) throw new IllegalArgumentException(); //se livro for null ou livro nao tiver disponivel, ja barra
        this.livro = livro;
        
        this.dataIni = LocalDate.now();
        
        this.dataEntregue = null;
        
        this.dataFim = dataIni.plusDays(14);
        
        // this.diasAtrasado = 0;
        
        // this.atrasado = false;
        
        // this.ativo = true;
    }

    //METODOS DO EMPRESTIMO
    public boolean registrarDevolução(){

    }


    public boolean isAtrasado(){

    }


    public boolean registrarDevolução(){

    }

    public double totalMulta(){
        if (isAtrasado == false) return 0;
    }
    
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
