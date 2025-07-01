import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<Pessoa> pessoasLista = new ArrayList<>();

    public void adicionarPessoa(Pessoa pessoa){
        pessoasLista.add(pessoa);
    }

    public void verLista(){
        for (Pessoa p : pessoasLista){
            System.out.println("Usuário: " + p.getNome() + "\n Telefone: " + p.getNumero() +
                    "\n Email: " + p.getEmail());
        }
    }

}
