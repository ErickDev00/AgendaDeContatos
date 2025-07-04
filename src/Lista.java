import java.util.ArrayList;
import java.util.List;

public class Lista {

    private List<Pessoa> pessoasLista = new ArrayList<>();

    //metodo que adiciona os usuarios na lista
    public void adicionarPessoa(Pessoa pessoa){
        pessoasLista.add(pessoa);
    }

    //metodo que exibe a lista
    public void verLista(){
        for (Pessoa p : pessoasLista){
            if (p.getEmail() == null){
                System.out.println("Usuário: " + p.getNome() + "\n Telefone: " + p.getNumero());
            } else {
                System.out.println("Usuário: " + p.getNome() + "\n Telefone: " + p.getNumero() +
                        "\n Email: " + p.getEmail());
            }

        }
    }

}
