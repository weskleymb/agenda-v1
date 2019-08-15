package br.senac.rn.agenda.view;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

import java.util.Scanner;

public class ContatoView {

    private static ContatoRepository repository = new ContatoRepository();
    private static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        Integer escolha = -1;

        do {
            ContatoView.getMenu();
            escolha = entrada.nextInt();
            switch (escolha) {
                case 1:
                    ContatoView.cadastrar();
                    break;
                case 2:
                    ContatoView.listarTodos();
                    break;
            }
        } while (escolha != 0);
        System.exit(0);
    }

    private static void listarTodos() {
        for (Contato contato : repository.buscaTodos()) {
            String id = contato.getId().toString();
            String nome = contato.getNome();
            String fone = contato.getFone();

            String saida = id + " - " + nome + " - " + fone;
            System.out.println(saida);
        }
    }

    private static void cadastrar() {
        System.out.println("Digite o nome:");
        String nome = entrada.next();
        System.out.println("Digite o fone:");
        String fone = entrada.next();
        Contato contato = new Contato(nome, fone);
        repository.salva(contato);
    }

    private static void getMenu() {
        String menu = "";
        menu += "=============================== \n";
        menu += "1 - Cadastrar Novo Contato      \n";
        menu += "2 - Listar Todos os Contatos    \n";
        menu += "3 - Buscar Contato pelo Nome    \n";
        menu += "4 - Editar um Contato           \n";
        menu += "5 - Excluir um Contato          \n";
        menu += "0 - SAIR                        \n";
        menu += "=============================== \n";
        menu += "Opção: ";
        System.out.print(menu);
    }

}
