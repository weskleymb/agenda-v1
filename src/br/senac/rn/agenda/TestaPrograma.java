package br.senac.rn.agenda;

import br.senac.rn.agenda.model.Contato;
import br.senac.rn.agenda.repository.ContatoRepository;

import java.util.List;

public class TestaPrograma {

    public static void main(String[] args) {

        ContatoRepository bancoDeDados = new ContatoRepository();

        Contato jota = new Contato("Jota Lopes", "9999-8888");

        bancoDeDados.salva(jota);

        Contato filipe = new Contato("Filipe Pontes", "8888-6666");

        Contato michele = new Contato("Michele Silva", "3232-1423");

        bancoDeDados.salva(michele);

        bancoDeDados.salva(filipe);

//        for (int i = 0; i < bancoDeDados.buscaTodos().size(); i++) {
//            Contato contato = bancoDeDados.buscaTodos().get(i);
//            System.out.println(contato.getNome());
//        }

        List<Contato> contatos = bancoDeDados.buscaTodos();

//        for (Contato contato : contatos) {
//            System.out.println(contato.getId() +" - "+ contato.getNome());
//        }

        Contato contatoBuscado = bancoDeDados.buscaPeloId(5L);

        System.out.println(contatoBuscado.getNome());

    }

}
