public class Biblioteca {
    public static void main(String[] args) {
        
        Livro l1 = new Livro("PEQUENO PRINCIPE" , "Antoine de Saint-Exupéry", 1);
        Livro l2 = new Livro("DIARIO DE ANNE FRANK" , "Anne Frank", 2);

        Usuario u1 = new Usuario("Augusto", 19);
        
        Emprestimo e1 = new Emprestimo(u1,l1);
        
    }


}
