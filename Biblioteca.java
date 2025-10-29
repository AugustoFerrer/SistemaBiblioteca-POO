import java.util.List;

public class Biblioteca {
    
    public static void main(String[] args) {
        
        Livro l1 = new Livro("PEQUENO PRINCIPE" , "Antoine de Saint-Exupéry", 1);
        Livro l2 = new Livro("DIARIO DE ANNE FRANK" , "Anne Frank", 2);
        Livro l3 = new Livro("DIARIO DE UM BANANA", "Jeff Kinney", 3);

        Usuario u1 = new Usuario("Augusto", 15);
        Usuario u2 = new Usuario("Aiko", 20);
        Usuario u3 = new Usuario("Gui", 25);

        Emprestimo e1 = new Emprestimo(u1, l1);

        boolean ok = u1.addEmprestimo(e1);
        System.out.println(ok);
        List <Emprestimo> emprestimosU1 = u1.getEmprestimos();
        //falta so os testes
    }


}
