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

        for (Contato contato : bancoDeDados.buscaTodos()) {
            System.out.println(contato.getId() +" - "+ contato.getNome());
        }

//        Contato contatoBuscado = bancoDeDados.buscaPeloNome("Jota Lopes");

//        System.out.println(contatoBuscado.getFone());

        Contato filipeNovo = bancoDeDados.buscaPeloNome("Filipe Pontes");
        filipeNovo.setNome("Filipe Vasco");

        bancoDeDados.edita(filipeNovo);

        bancoDeDados.remove(jota);

        Contato caio = new Contato("Caio Silva", "4546-4874");

        bancoDeDados.salva(caio);

        System.out.println("======================================");

        for (Contato contato : bancoDeDados.buscaTodos()) {
            System.out.println(contato.getId() +" - "+ contato.getNome());
        }

    }

}
