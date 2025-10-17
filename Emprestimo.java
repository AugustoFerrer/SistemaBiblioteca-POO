import java.time.LocalDate;

public class Emprestimo {
    
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataIni;
    private LocalDate dataFim;
    private boolean ativo;

    public Emprestimo(Usuario usuario, Livro livro){
        this.usuario = usuario;
        this.livro = livro;
        this.dataIni = LocalDate.now();
        this.dataFim = dataIni.plusDays(14);
        this.ativo = true;
    }

}
