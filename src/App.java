import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jon");
        pessoa.setIdade(22);
        pessoa.setAltura(1.77);
        
        String nome = pessoa.getNome();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());
    }
}
