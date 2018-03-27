
import java.time.LocalDate;

/**
 *
 * @author gabriel
 */
public class Paciente {

    private String rg, nome;
    private LocalDate dataNascimento;

    public Paciente(String rg, String nome, LocalDate dataNascimento) {
        this.rg = rg;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getRg() {
        return rg;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Paciente{" + "rg=" + rg + ", nome=" + nome + ", dataNascimento=" + dataNascimento + '}';
    }

}
