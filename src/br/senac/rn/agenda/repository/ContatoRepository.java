package br.senac.rn.agenda.repository;

import br.senac.rn.agenda.model.Contato;

import java.util.ArrayList;
import java.util.List;

public class ContatoRepository {

//    private static Long id = 0L;
    private static List<Contato> contatos = new ArrayList<Contato>();

    public void salva(Contato contato) {
        contatos.add(contato);
        Long id = Long.valueOf(contatos.size());
        contato.setId(id);
    }

    public List<Contato> buscaTodos() {
        List<Contato> copiaContatos = new ArrayList<Contato>(contatos);
        return copiaContatos;
    }

    public Contato buscaPeloId(Long id) {
        for (Contato contato : contatos) {
            if (contato.getId().equals(id)) {
                return contato;
            }
        }
        return null;
    }

}
