import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame {
    private JButton buttonBolme;
    private JButton buttonCikarma;
    private JButton buttonToplama;
    private JButton buttonCarpma;
    private JTextField birinciSayi;

    private JTextField ikinciSayi;
    private JTextField sonuc;
    private JPanel panel1;

    public form1() {
        add(panel1);
        setSize(400,200);
        setTitle("İlk swing Form");

        buttonToplama.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sayiBir = Integer.valueOf(birinciSayi.getText());
                int sayiIki = Integer.valueOf(ikinciSayi.getText());
                sonuc.setText(String.valueOf(sayiBir+sayiIki));
            }
        });
        buttonCikarma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sayiBir = Integer.valueOf(birinciSayi.getText());
                int sayiIki = Integer.valueOf(ikinciSayi.getText());
                sonuc.setText(String.valueOf(sayiBir-sayiIki));
            }
        });
        buttonCarpma.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sayiBir = Integer.valueOf(birinciSayi.getText());
                int sayiIki = Integer.valueOf(ikinciSayi.getText());
                sonuc.setText(String.valueOf(sayiBir*sayiIki));
            }
        });
        buttonBolme.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sayiBir = Integer.valueOf(birinciSayi.getText());
                int sayiIki = Integer.valueOf(ikinciSayi.getText());
                sonuc.setText(String.valueOf((double)sayiBir/sayiIki));
            }
        });
    }

}
