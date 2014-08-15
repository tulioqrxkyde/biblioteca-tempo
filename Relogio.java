package tempo;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 * Relógio
 *
 * @author tulio.xcrtf
 */
public class Relogio extends JFrame {

    JLabel horario, data;

    /**
     * Construtor default - define os componentes e inicializa o frame.
     */
    Relogio() {
        super("Relógio demonstrativo.");
        super.setSize(270, 70);
        super.setLocationRelativeTo(null);
        super.setLayout(new FlowLayout());

        this.horario = new JLabel();
        this.data = new JLabel();
        super.add(horario);
        super.add(data);
        super.setVisible(true);

        Timer time = new Timer(1000, init);
        time.start();
    }
    ActionListener init = (new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            showTime();
        }
    });
    
    public Relogio(Tempo t) {
        this();
    }

    /**
     * Método de exibição do horário & data.
     */
    private void showTime() {
        /* Utilizando o objeto Tempo */
        Tempo t = new Tempo();
        /* Obtendo: dia, mês, ano, hora, minuto e segundo. */
        data.setText(t.getDiaAtualMes() + "/"
                + (t.getMesAtual() + 1) + "/" + t.getAnoAtual());
        horario.setText(t.getHoraAtual() + ":" + t.getMinutoAtual() + ":" + t.getSegundoAtual());
    }

    public static void main(String[] args) {
        Relogio r = new Relogio();
    }
}
