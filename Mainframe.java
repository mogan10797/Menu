import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.Container;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class Mainframe extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Container cp;
    private JPanel jpn1 = new JPanel(new BorderLayout(3, 3));
    private JPanel jpn2 = new JPanel(new GridLayout(8, 4, 3, 3));
    private JPanel jpn3 = new JPanel(new GridLayout(1, 3, 3, 3));
    private JPanel jpn4 = new JPanel(new BorderLayout(3, 3));
    private JPanel jpn5 = new JPanel(new GridLayout(1, 1, 3, 3));
    private JButton jbtn1 = new JButton("Check");
    private JButton jbtn2 = new JButton("Clear");
    private JButton jbtn3 = new JButton("Exit");
    private JLabel jlb1 = new JLabel("請點選服務");
    private JLabel jlb2 = new JLabel("Noodel System");
    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane(jta);

    private JCheckBox jcb1 = new JCheckBox("牛肉蛋花麵-110$");
    private JComboBox jcb11 = new JComboBox<Integer>();
    private JRadioButton jrb01 = new JRadioButton("不要辣");
    private JRadioButton jrb02 = new JRadioButton("要辣");

    private JCheckBox jcb2 = new JCheckBox("牛肉麵-100$");
    private JComboBox jcb22 = new JComboBox<Integer>();
    private JRadioButton jrb11 = new JRadioButton("不要辣");
    private JRadioButton jrb12 = new JRadioButton("要辣");

    private JCheckBox jcb3 = new JCheckBox("牛肉湯麵-55$");
    private JComboBox jcb33 = new JComboBox<Integer>();
    private JRadioButton jrb21 = new JRadioButton("不要辣");
    private JRadioButton jrb22 = new JRadioButton("要辣");

    private JCheckBox jcb4 = new JCheckBox("牛肉湯蛋花麵-65$");
    private JComboBox jcb44 = new JComboBox<Integer>();
    private JRadioButton jrb31 = new JRadioButton("不要辣");
    private JRadioButton jrb32 = new JRadioButton("要辣");

    private JCheckBox jcb5 = new JCheckBox("榨菜肉絲麵-55$");
    private JComboBox jcb55 = new JComboBox<Integer>();
    private JRadioButton jrb41 = new JRadioButton("不要辣");
    private JRadioButton jrb42 = new JRadioButton("要辣");

    private JCheckBox jcb6 = new JCheckBox("餛飩麵-55$");
    private JComboBox jcb66 = new JComboBox<Integer>();
    private JRadioButton jrb51 = new JRadioButton("不要辣");
    private JRadioButton jrb52 = new JRadioButton("要辣");

    private JCheckBox jcb7 = new JCheckBox("貢丸麵-55$");
    private JComboBox jcb77 = new JComboBox<Integer>();
    private JRadioButton jrb61 = new JRadioButton("不要辣");
    private JRadioButton jrb62 = new JRadioButton("要辣");

    private JCheckBox jcb8 = new JCheckBox("陽春湯麵-35$");
    private JComboBox jcb88 = new JComboBox<Integer>();
    private JRadioButton jrb71 = new JRadioButton("不要辣");
    private JRadioButton jrb72 = new JRadioButton("要辣");

    private ButtonGroup bg1 = new ButtonGroup();
    private ButtonGroup bg2 = new ButtonGroup();
    private ButtonGroup bg3 = new ButtonGroup();
    private ButtonGroup bg4 = new ButtonGroup();
    private ButtonGroup bg5 = new ButtonGroup();
    private ButtonGroup bg6 = new ButtonGroup();
    private ButtonGroup bg7 = new ButtonGroup();
    private ButtonGroup bg8 = new ButtonGroup();

    public Mainframe() {
        init();
    }

    public void init() {
        cp = this.getContentPane();
        cp.setLayout(new BorderLayout(3, 3));
        this.setTitle("Menu");
        this.setBounds(200, 300, 600, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.add(jpn1, BorderLayout.NORTH);
        cp.add(jpn4, BorderLayout.SOUTH);
        jpn4.add(jpn5, BorderLayout.CENTER);
        jpn1.add(jpn2, BorderLayout.CENTER);
        jpn1.add(jpn3, BorderLayout.SOUTH);
        cp.add(jsp, BorderLayout.CENTER);
        jta.setEditable(false);
        jlb1.setFont(new Font(null, Font.BOLD, 22));
        jlb1.setHorizontalAlignment(JLabel.CENTER);
        jlb2.setFont(new Font(null, Font.BOLD, 25));
        jlb2.setHorizontalAlignment(JLabel.CENTER);
        jpn5.add(jlb2);
        jpn3.add(jlb1);
        jpn3.add(jbtn1);
        jpn3.add(jbtn2);
        jpn3.add(jbtn3);
        jbtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int val1 = 0, val2 = 0, val3 = 0, val4 = 0, val5 = 0, val6 = 0, val7 = 0, val8 = 0, tatol = 0;
                jta.append("Noodle Choice \n");

                if (jcb1.isSelected()) {
                    jta.append("牛肉蛋花麵-110$ \n");
                    if (jrb01.isSelected()) {
                        jta.append("不要辣 \n");
                    } else if (jrb02.isSelected()) {
                        jta.append("要辣 \n");
                    }
                    jta.append(jcb11.getSelectedItem() + "份 \n");
                    val1 = 110 * Integer.parseInt(jcb11.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val1) + "元 \n");
                }

                if (jcb2.isSelected()) {
                    jta.append("牛肉麵-100$ \n");
                    if (jrb11.isSelected()) {
                        jta.append("不要辣 \n");
                    } else if (jrb12.isSelected()) {
                        jta.append("要辣 \n");
                    }
                    jta.append(jcb22.getSelectedItem() + "份 \n");
                    val2 = 100 * Integer.parseInt(jcb22.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val2) + "元 \n");
                }

                if (jcb3.isSelected()) {
                    jta.append("牛肉湯麵-55$ \n");
                    if (jrb21.isSelected()) {
                        jta.append("不要辣 \n");
                    } else if (jrb22.isSelected()) {
                        jta.append("要辣 \n");
                    }
                    jta.append(jcb33.getSelectedItem() + "份 \n");
                    val3 = 55 * Integer.parseInt(jcb33.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val3) + "元 \n");
                }

                if (jcb4.isSelected()) {
                    jta.append("牛肉湯蛋花麵-65$ \n");
                    if (jrb31.isSelected()) {
                        jta.append("不要辣 \n");
                    } else if (jrb32.isSelected()) {
                        jta.append("要辣 \n");
                    }
                    jta.append(jcb44.getSelectedItem() + "份 \n");
                    val4 = 65 * Integer.parseInt(jcb44.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val4) + "元 \n");
                }

                if (jcb5.isSelected()) {
                    jta.append("榨菜肉絲麵-55$ \n");
                    if (jrb41.isSelected()) {
                        jta.append("不要辣 \n");
                    } else if (jrb42.isSelected()) {
                        jta.append("要辣 \n");
                    }
                    jta.append(jcb55.getSelectedItem() + "份 \n");
                    val5 = 55 * Integer.parseInt(jcb55.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val5) + "元 \n");
                }
                if (jcb6.isSelected()) {
                    jta.append("餛飩麵-55$ \n");
                    if (jrb51.isSelected()) {
                        jta.append("不要辣 \n");
                    } else if (jrb52.isSelected()) {
                        jta.append("要辣 \n");
                    }
                    jta.append(jcb66.getSelectedItem() + "份 \n");
                    val6 = 55 * Integer.parseInt(jcb66.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val6) + "元 \n");
                }
                if (jcb7.isSelected()) {
                    jta.append("貢丸麵-55$ \n");
                    if (jrb61.isSelected()) {
                        jta.append("不要辣 \n");
                    } else if (jrb62.isSelected()) {
                        jta.append("要辣 \n");
                    }
                    jta.append(jcb77.getSelectedItem() + "份 \n");
                    val7 = 55 * Integer.parseInt(jcb77.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val7) + "元 \n");
                }
                if (jcb8.isSelected()) {
                    jta.append("陽春湯麵-35$ \n");
                    if (jrb71.isSelected()) {
                        jta.append("不要辣 \n");
                    } else if (jrb72.isSelected()) {
                        jta.append("要辣 \n");
                    }
                    jta.append(jcb88.getSelectedItem() + "份 \n");
                    val8 = 35 * Integer.parseInt(jcb88.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val8) + "元 \n");
                }
                tatol = val1 + val2 + val3 + val4 + val5 + val6 + val7 + val8;
                jta.append("共計 : " + Integer.toString(tatol) + "元 \n");
            }

        });

        jbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jta.setText("");
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Mainframe.this.dispose();
            }
        });

        jcb11.addItem("1");
        jcb11.addItem("2");
        jpn2.add(jcb1);
        jpn2.add(jcb11);
        jpn2.add(jrb01);
        jpn2.add(jrb02);
        bg1.add(jrb01);
        bg1.add(jrb02);

        jcb22.addItem("1");
        jcb22.addItem("2");
        jpn2.add(jcb2);
        jpn2.add(jcb22);
        jpn2.add(jrb11);
        jpn2.add(jrb12);
        bg2.add(jrb11);
        bg2.add(jrb12);

        jcb33.addItem("1");
        jcb33.addItem("2");
        jpn2.add(jcb3);
        jpn2.add(jcb33);
        jpn2.add(jrb21);
        jpn2.add(jrb22);
        bg3.add(jrb21);
        bg3.add(jrb22);

        jcb44.addItem("1");
        jcb44.addItem("2");
        jpn2.add(jcb4);
        jpn2.add(jcb44);
        jpn2.add(jrb31);
        jpn2.add(jrb32);
        bg4.add(jrb31);
        bg4.add(jrb32);

        jcb55.addItem("1");
        jcb55.addItem("2");
        jpn2.add(jcb5);
        jpn2.add(jcb55);
        jpn2.add(jrb41);
        jpn2.add(jrb42);
        bg5.add(jrb41);
        bg5.add(jrb42);

        jcb66.addItem("1");
        jcb66.addItem("2");
        jpn2.add(jcb6);
        jpn2.add(jcb66);
        jpn2.add(jrb51);
        jpn2.add(jrb52);
        bg6.add(jrb51);
        bg6.add(jrb52);

        jcb77.addItem("1");
        jcb77.addItem("2");
        jpn2.add(jcb7);
        jpn2.add(jcb77);
        jpn2.add(jrb61);
        jpn2.add(jrb62);
        bg7.add(jrb61);
        bg7.add(jrb62);

        jcb88.addItem("1");
        jcb88.addItem("2");
        jpn2.add(jcb8);
        jpn2.add(jcb88);
        jpn2.add(jrb71);
        jpn2.add(jrb72);
        bg8.add(jrb71);
        bg8.add(jrb72);
    }
}