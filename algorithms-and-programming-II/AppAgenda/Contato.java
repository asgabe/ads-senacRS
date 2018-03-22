
/**
 *
 * @author gabriel
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Contato extends AbstractContato {

    protected Calendar dtnasc;

    public Contato(String nome, Calendar dtnasc) {
        super(nome);
        this.dtnasc = dtnasc;
    }
}
