import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.awt.event.*;
import java.util.ArrayList;

public class CalisanEkrani extends JDialog {
    DefaultTableModel model;
    CalisanIslemleri islemler = new CalisanIslemleri();
    private JPanel contentPane;
    private JTable table1;
    private JTextField aramaCubugu;
    private JTextField adField;
    private JTextField soyadField;
    private JTextField deptField;
    private JTextField maasField;
    private JLabel mesajYazisi;
    private JButton calisanEkle;
    private JButton guncelle;
    private JButton sil;
    private JButton buttonOK;
    private JButton buttonCancel;


    public void calisanGoruntule() {
        model.setRowCount(0);
        ArrayList<Calisan> calisanlar = new ArrayList<Calisan>();
        calisanlar = islemler.calisanlariGetir();

        if (calisanlar != null) {
            for (Calisan calisan : calisanlar) {
                Object[] eklenecek = {calisan.getId(), calisan.getAd(), calisan.getSoyad(), calisan.getDepartman(), calisan.getMaas()};
                model.addRow(eklenecek);
            }
        }

    }

    public void dinamikAra(String ara) {
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
        table1.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(ara));
    }
    public CalisanEkrani(java.awt.Frame parent, boolean modal) {
        super(parent,modal);
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        model = (DefaultTableModel) table1.getModel();
        calisanGoruntule();


        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });

        // call onCancel() when cross is clicked
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onCancel();
            }
        });

        // call onCancel() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        aramaCubugu.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String ara = aramaCubugu.getText();

                dinamikAra(ara);
            }
        });
        calisanEkle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesajYazisi.setText("");

                String ad = adField.getText();
                String soyad = soyadField.getText();
                String departman = deptField.getText();
                String maas = maasField.getText();

                islemler.calisanEkle(ad,soyad,departman,maas);
                calisanGoruntule();
                mesajYazisi.setText("Yeni Çalışan Başarıyla Eklendi...");

            }
        });
        table1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int selectedRow = table1.getSelectedRow();
                adField.setText(model.getValueAt(selectedRow,1).toString());
                soyadField.setText(model.getValueAt(selectedRow,2).toString());
                deptField.setText(model.getValueAt(selectedRow,3).toString());
                maasField.setText(model.getValueAt(selectedRow,4).toString());
            }
        });
        guncelle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String ad = adField.getText();
                String soyad = soyadField.getText();
                String departman = deptField.getText();
                String maas = maasField.getText();

                int selectedrow = table1.getSelectedRow();

                if (selectedrow == -1) {
                    if (model.getRowCount() == 0) {
                        mesajYazisi.setText("Çalışanlar Tablosu şu ando boş.");
                    } else {
                        mesajYazisi.setText("Lütfen güncellenecek bir çalışan seçin.");
                    }
                } else {
                    int id = (int) model.getValueAt(selectedrow, 0);
                    islemler.calisanGuncelle(id, ad ,soyad, departman, maas);
                    calisanGoruntule();
                    mesajYazisi.setText("Çalışan başarıyla güncellendi...");
                }

            }
        });
        sil.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mesajYazisi.setText("");

                int selectedrow = table1.getSelectedRow();

                if (selectedrow == -1) {
                    if (model.getRowCount() == 0) {
                        mesajYazisi.setText("Çalışanlar Tablosu şu ando boş.");
                    } else {
                        mesajYazisi.setText("Lütfen silinecek bir çalışan seçin.");
                    }
                } else {
                    int id = (int) model.getValueAt(selectedrow, 0);
                    islemler.calisanSil(id);
                    calisanGoruntule();
                    mesajYazisi.setText("Çalışan başarıyla silindi...");
                }

            }
        });
    }

    private void onOK() {
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CalisanEkrani dialog = new CalisanEkrani(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

}
