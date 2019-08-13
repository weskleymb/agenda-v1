package br.senac.rn.agenda.repository;

import br.senac.rn.agenda.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatoRepository {

    private static List<Contato> contatos = new ArrayList<Contato>();

    public void salva(Contato contato) {
        contatos.add(contato);
    }

    public List<Contato> buscaTodos() {
        return contatos;
    }

}
