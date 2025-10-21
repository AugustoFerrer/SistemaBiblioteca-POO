public class Livro {
   
    private String titulo;
    private String autor;
    private int isbn;
    private boolean disponivel;

    //CONSTRUTOR COM TODO LIVRO AO SER CRIADO, SER DISPONÍVEL PRA EMPRÉSTIMO
    public Livro (String titulo, String autor, int isbn){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.disponivel = true;
    }

    //RETORNA SE LIVRO PODE SER EMPRESTADO (TRUE) OU NÃO (FALSE) 
    // SERIA TIPO UM "DESATIVAR"
    public boolean Emprestar(){
        if (!this.disponivel) return false; //ja está emprestado
        this.disponivel = false;
        return true;
        }
    
    //RETORNA SE LIVRO PODE SER DEVOLVIDO (TRUE) OU NÃO (FALSE)
    // SERIA TIPO UM "ATIVAR"
    public boolean Devolver(){
        if (this.disponivel) return false; //ja está devolvido
        this.disponivel = true;
        return true;
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

    public int getIsbn(){
        return this.isbn;
    }

}
