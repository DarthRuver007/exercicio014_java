
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int nasc, atual, idade;
        nasc = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano seu nascimento com quatro dígitos: "));
        atual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual com quatro dígitos: "));
        idade = atual - nasc;
        if (nasc <= atual) {
            JOptionPane.showMessageDialog(null, "A idade é: " + idade);
        } else {
            JOptionPane.showMessageDialog(null, """
                                                Não foi possível calcular a idade. 
                                                O ano de nascimento deve ser menor que o ano atual.""");
        }
    }
}
