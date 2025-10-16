public class Livro {
   
    private String titulo;
    private String autor;
    private double isbn;
    private boolean disponivel;

    //CONSTRUTOR COM TODO LIVRO AO SER CRIADO, SER DISPONÍVEL PRA EMPRÉSTIMO
    public Livro (String titulo, String autor, double isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    //RETORNA SE LIVRO PODE SER EMPRESTADO (TRUE) OU NÃO (FALSE)
    public boolean Emprestar(){
        if (!this.disponivel){
            return false;
        }
        else{
            this.disponivel = false;
            return true;
        }
    }
    
    //RETORNA SE LIVRO PODE SER DEVOLVIDO (TRUE) OU NÃO (FALSE)
    public boolean Devolver(){
        if (this.disponivel){
            return false;
        }
        else{
            this.disponivel = false;
            return true;
        }
    }

    //GETTERS
    public boolean isDisponivel(){
        return this.disponivel;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }

    public double getIsbn(){
        return this.isbn;
    }

}
