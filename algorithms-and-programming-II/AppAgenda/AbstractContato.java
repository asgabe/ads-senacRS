
/**
 *
 * @author gabriel
 */

import java.util.ArrayList;

abstract class AbstractContato {

    protected String nome;
    protected ArrayList<Telefone> telefones;

    public AbstractContato(String nome) {
        this.nome = nome;
        telefones = new ArrayList();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(Telefone tf) {
        telefones.add(tf);
    }

    public String getDados() {
        String ret = nome + "\n";

        for (Telefone t : telefones) {
            ret += t.getTelefone() + "\n";
        }

        return ret;
    }
}
