import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GirisEkrani extends JFrame{
    CalisanIslemleri islemler = new CalisanIslemleri();

    public GirisEkrani() {
        add(panel1);
        setSize(400,200);
        setTitle("İlk Swing Form");

        GirisEkrani girisEkrani = new GirisEkrani();

        girisYapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesaj.setText("");

                String name = nameField1.getText();
                String password = new String(passwordField1.getPassword());

                boolean girisBasarili = islemler.girisYap(name,password);

                if (girisBasarili) {
                    CalisanEkrani calisanEkrani = new CalisanEkrani(girisEkrani,true);
                    setVisible(false);
                    calisanEkrani.setVisible(true);
                    System.exit(0);
                }else {
                    mesaj.setText("Giriş Başarısız... Lütfen tekrar deneyin.");
                }
            }
        });
    }

    private JTextField nameField1;
    private JPasswordField passwordField1;
    private JButton girisYapButton;
    private JLabel mesaj;
    private JPanel panel1;
}
