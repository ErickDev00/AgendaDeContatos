import java.util.Scanner;

public class AgendaMain {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);

        Lista agenda = new Lista();

        for (int i=0; i <= 10; i++ ){

            int opcaoMenu = 0;
            System.out.println("Digite a opção desejada \n Opção 1: Adicionar Contato" +
                    "\n Opção 2: Ver Lista de Contatos");
            opcaoMenu += ent.nextInt();
            ent.nextLine();

            if (opcaoMenu == 1){
                int opcaoEmail = 0;
                String nome = "";
                String telefone = "";
                String email = "";
                System.out.println("Digite o nome do contato");
                nome += ent.nextLine();

                System.out.println("Digite o numero de telefone");
                telefone += ent.nextLine();

                System.out.println("Deseja adicionar email? \n Digite 1 para sim e 2 para não");
                opcaoEmail += ent.nextInt();
                ent.nextLine();

                    if (opcaoEmail == 1){
                        System.out.println("Digite o email");
                        email = ent.nextLine();

                        Pessoa p = new Pessoa(nome, telefone, email);
                        agenda.adicionarPessoa(p);
                        System.out.println("\n Contado Adicionado");
                    } else {
                        Pessoa p = new Pessoa(nome, telefone);
                        agenda.adicionarPessoa(p);
                        System.out.println("Contado Adicionado");
                    }
            } else {
                agenda.verLista();
            }








        }





    }
}