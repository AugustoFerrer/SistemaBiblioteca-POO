import java.time.LocalDate;

public class Biblioteca {
    public static void main(String[] args) {
        
        LocalDate hoje = LocalDate.now();
        
        //CRIANDO DE LIVROS E USUÁRIOS
        System.out.println("TESTE 1: CRIANDO");
        Livro l1 = new Livro("PEQUENO PRINCIPE" , "Antoine de Saint-Exupéry", 1);
        Livro l2 = new Livro("DIARIO DE ANNE FRANK" , "Anne Frank", 2);
        Livro l3 = new Livro("DIARIO DE UM BANANA", "Jeff Kinney", 3);
        Livro l4 = new Livro("O HOBBIT", "J.R.R. Tolkien", 4);

        Usuario u1 = new Usuario("Augusto", 15);
        Usuario u2 = new Usuario("Gabriel", 20);

        System.out.println("Criado: " + u1.getNome());
        System.out.println("Criado: " + u2.getNome());
        System.out.println("Livros: " + l1.getTitulo() + ", " + l2.getTitulo() + ", " + l3.getTitulo() + ", " + l4.getTitulo());


        //EMPRÉSTIMOS VÁLIDOS (AtÉ LIM.)
        System.out.println("\nTESTE 2: EMPRESTIMOS VALIDOS");
        
        Emprestimo e1 = new Emprestimo(u1, l1);
        boolean ok1 = u1.addEmprestimo(e1);
        System.out.println("Emprestimo 1: " + ok1); // Deve ser true
        
        Emprestimo e2 = new Emprestimo(u1, l2);
        boolean ok2 = u1.addEmprestimo(e2);
        System.out.println("Emprestimo 2: " + ok2); // Deve ser true
        
        Emprestimo e3 = new Emprestimo(u1, l3);
        boolean ok3 = u1.addEmprestimo(e3);
        System.out.println("Emprestimo 3: " + ok3); // Deve ser true

        System.out.println("Total emprestimos " + u1.getNome() + ": " + u1.getEmprestimos().size()); // 3
        System.out.println(l2.getTitulo() + " disponivel? " + l2.isDisponivel()); // false


        //TENTATIVA 4º EMPRÉSTIMO (Deve falhar)
        System.out.println("\nTESTE 3: LIMITE DE EMPRESTIMOS");
        
        boolean podePegar = u1.podePegarEmprestado(); // Deve ser false
        System.out.println(u1.getNome() + " pode pegar mais? " + podePegar);
        
        if (podePegar) {
             // Nao deve entrar aqui
             Emprestimo e4 = new Emprestimo(u1, l4);
             u1.addEmprestimo(e4);
             System.out.println("Emprestimo 4: SUCESSO");
        } else {
             System.out.println("Emprestimo 4: FALHA (LIMITE ATINGIDO)");
        }
        
        System.out.println("Total emprestimos " + u1.getNome() + ": " + u1.getEmprestimos().size()); // 3
        System.out.println(l4.getTitulo() + " disponivel? " + l4.isDisponivel()); // true


        //DEVOLUÇÕES (No prazo e com atraso)
        System.out.println("\nTESTE 4: DEVOLUCOES");

        //DEVOL. 1 (NO PRAZO)
        LocalDate dataDevolucaoPrazo = hoje.plusDays(10);
        System.out.println("Devolvendo " + l1.getTitulo() +" (no prazo)...");
        
        e1.registrarDevolução(dataDevolucaoPrazo); 
        l1.Devolver(); 
        u1.removeEmprestimo(e1);

        System.out.println("e1 ativo? " + e1.isAtivo()); // false
        System.out.println("l1 disponivel? " + l1.isDisponivel()); // true
        System.out.println("Total emprestimos "+ u1.getNome() +": " + u1.getEmprestimos().size()); // 2

        //DEVOL. 2 (COM ATRASO)
        LocalDate dataDevolucaoAtraso = hoje.plusDays(20);
        System.out.println("Devolvendo " + l2.getTitulo() +" (com atraso)...");
        
        e2.registrarDevolução(dataDevolucaoAtraso); 
        l2.Devolver();
        u1.removeEmprestimo(e2);

        System.out.println("e2 ativo? " + e2.isAtivo()); // false
        System.out.println("l2 disponivel? " + l2.isDisponivel()); // true
        System.out.println("Total emprestimos "+ u1.getNome() +": " + u1.getEmprestimos().size()); // 1


        //CÁLCULO MULTA TOTAL
        System.out.println("\nTESTE 5: MULTAS");

        // MULTA 1 (NO PRAZO)
        double multaE1 = e1.getTotalMulta();
        System.out.println("Multa " + e1.getLivro().getTitulo() +" : " + multaE1); // 0.0 (lembrei aqui que eu posso pegar no proprio emprestimo o livro, e dps pegar o titulo dele)

        // MULTA 2 (COM ATRASO)
        long diasAtrasoE2 = e2.getDiasAtrasado();
        double multaE2 = e2.getTotalMulta();
        System.out.println("Multa " + e2.getLivro().getTitulo() + " :");
        System.out.println("  Dias atraso: " + diasAtrasoE2); // 6
        System.out.println("  Valor total: " + multaE2); // 9.0
    }
}