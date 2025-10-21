import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataIni;
    private LocalDate dataEntregue;
    private LocalDate dataFim;
    private final double multaDiaria;


    public Emprestimo(Usuario usuario, Livro livro){
        if (usuario == null) throw new IllegalArgumentException("USUÁRIO NULO"); //se usuario for null, ja barra
        this.usuario = usuario;
        
        if (livro == null || livro.isDisponivel() == false) throw new IllegalArgumentException("LIVRO NÃO DISPONÍVEL"); //se livro for null ou livro nao tiver disponivel, ja barra
        this.livro = livro;
        livro.Emprestar();
        
        this.dataIni = LocalDate.now();
        this.dataEntregue = null;
        this.dataFim = dataIni.plusDays(14);
        this.multaDiaria = 1.50;
    }

    //METODOS DO EMPRESTIMO
    public boolean isAtivo(){
        return this.dataEntregue == null;
    }
    
    public boolean registrarDevolução(){
        if (isAtivo() == false) return false; //se ja tiver sido entrege, faz nada
        this.dataEntregue = LocalDate.now();
        return true;
    }

    public boolean foiEntregueComAtraso(){
        if (isAtivo()) return false; //se ta ativo, não foi entregue ainda
        return (dataEntregue.isAfter(this.dataFim)); //vê se a data entregue eh depois do prazo final, se sim, foi entregue com atraso
    }

    public long getDiasAtrasado(){
        if (foiEntregueComAtraso() == false) return 0; //aqui nao tem dias atrasado ja que foi entregue dentro do prazo
        long diasDeAtraso = ChronoUnit.DAYS.between(this.dataFim, this.dataEntregue);
        return diasDeAtraso;
    }

    public double getTotalMulta(){
        return (getDiasAtrasado() * this.multaDiaria);
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
}
