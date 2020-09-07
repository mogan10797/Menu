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
import java.awt.Font;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.*;

public class Mainframe2 extends JFrame {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Container cp;
    private JPanel jpn1 = new JPanel(new BorderLayout(3, 3));
    private JPanel jpn2 = new JPanel(new GridLayout(7, 5, 3, 3));
    private JPanel jpn3 = new JPanel(new GridLayout(1, 4, 3, 3));
    private JPanel jpn4=new JPanel(new BorderLayout(3,3));
    private JPanel jpn5=new JPanel(new GridLayout(1,1,3,3));
    
    private JButton jbtn1 = new JButton("Check");
    private JButton jbtn2 = new JButton("Clear");
    private JButton jbtn3 = new JButton("Exit");
    private JLabel jlb1=new JLabel("請選擇服務");
    private JLabel jlb2=new JLabel("Soup System");
    private JTextArea jta = new JTextArea();
    private JScrollPane jsp = new JScrollPane(jta);

    private JCheckBox jcb1 = new JCheckBox("牛肉蛋花湯-$100");
    private JComboBox jcb11 = new JComboBox<Integer>();
    private JRadioButton jrb11 = new JRadioButton("加香菜");
    private JRadioButton jrb12 = new JRadioButton("不加香菜");

    private JCheckBox jcb2 = new JCheckBox("牛肉湯-$90");
    private JComboBox jcb22 = new JComboBox<Integer>();
    private JRadioButton jrb21 = new JRadioButton("加香菜");
    private JRadioButton jrb22 = new JRadioButton("不加香菜");

    private JCheckBox jcb3 = new JCheckBox("牛肉清湯加蛋花-$35");
    private JComboBox jcb33 = new JComboBox<Integer>();
    private JRadioButton jrb31 = new JRadioButton("加香菜");
    private JRadioButton jrb32 = new JRadioButton("不加香菜");

    private JCheckBox jcb4 = new JCheckBox("餛飩湯-$40");
    private JComboBox jcb44 = new JComboBox<Integer>();
    private JRadioButton jrb41 = new JRadioButton("加香菜");
    private JRadioButton jrb42 = new JRadioButton("不加香菜");

    private JCheckBox jcb5 = new JCheckBox("貢丸湯-$35");
    private JComboBox jcb55 = new JComboBox<Integer>();
    private JRadioButton jrb51 = new JRadioButton("加香菜");
    private JRadioButton jrb52 = new JRadioButton("不加香菜");

    private JCheckBox jcb6 = new JCheckBox("蛋花湯-$30$");
    private JComboBox jcb66 = new JComboBox<Integer>();
    private JRadioButton jrb61 = new JRadioButton("加香菜");
    private JRadioButton jrb62 = new JRadioButton("不加香菜");

    private JCheckBox jcb7 = new JCheckBox("青菜湯-$25");
    private JComboBox jcb77 = new JComboBox<Integer>();
    private JRadioButton jrb71 = new JRadioButton("加香菜");
    private JRadioButton jrb72 = new JRadioButton("不加香菜");

    private ButtonGroup bg1 = new ButtonGroup();
    private ButtonGroup bg2 = new ButtonGroup();
    private ButtonGroup bg3 = new ButtonGroup();
    private ButtonGroup bg4 = new ButtonGroup();
    private ButtonGroup bg5 = new ButtonGroup();
    private ButtonGroup bg6 = new ButtonGroup();
    private ButtonGroup bg7 = new ButtonGroup();

    public Mainframe2() {
        init();
    }

    public void init() {
        cp = this.getContentPane();
        this.setTitle("Meun");
        this.setBounds(200, 300, 700, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp.setLayout(new BorderLayout(3, 3));
        cp.add(jsp,BorderLayout.CENTER);
        jta.setEditable(false);
        cp.add(jpn1, BorderLayout.SOUTH);
        jpn1.add(jpn2, BorderLayout.CENTER);
        jpn1.add(jpn3, BorderLayout.SOUTH);
        cp.add(jpn4,BorderLayout.NORTH);
        jpn4.add(jpn5,BorderLayout.CENTER);
        jlb1.setHorizontalAlignment(JLabel.CENTER);
        jlb2.setHorizontalAlignment(JLabel.CENTER);
jlb1.setFont(new Font(null,Font.BOLD,22));
jlb2.setFont(new Font(null,Font.BOLD,25));
        jbtn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                int val1 = 0, val2 = 0, val3 = 0, val4 = 0, val5 = 0, val6 = 0, val7 = 0, total = 0;
                jta.append("Soup Chioce \n");

                if (jcb1.isSelected()) {
                    jta.append("牛肉蛋花湯-$100 ");
                    if (jrb11.isSelected()) {
                        jta.append("  加香菜 ");
                    } else if (jrb12.isSelected()) {
                        jta.append("  不加香菜 ");
                    }
                    jta.append(jcb11.getSelectedItem() + "碗 ");
                    val1 = 100 * Integer.parseInt(jcb11.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val1) + "元 \n");
                }
                if (jcb2.isSelected()) {
                    jta.append("牛肉湯-$90 ");
                    if (jrb21.isSelected()) {
                        jta.append("  加香菜 ");
                    } else if (jrb22.isSelected()) {
                        jta.append("  不加香菜 ");
                    }
                    jta.append(jcb22.getSelectedItem() + " 碗 ");
                    val2 = 90 * Integer.parseInt(jcb22.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val2) + "元 \n");
                }

                if (jcb3.isSelected()) {
                    jta.append("牛肉清湯加蛋花-$35 ");
                    if (jrb31.isSelected()) {
                        jta.append("加香菜 ");
                    } else if (jrb32.isSelected()) {
                        jta.append("不加香菜 ");
                    }
                    jta.append(jcb33.getSelectedItem() + "碗 ");
                    val3 = 35 * Integer.parseInt(jcb33.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val3) + "元 \n");
                }

                if (jcb4.isSelected()) {
                    jta.append("餛飩湯-$40 ");
                    if (jrb41.isSelected()) {
                        jta.append("加香菜 ");
                    } else if (jrb42.isSelected()) {
                        jta.append("不加香菜 ");
                    }
                    jta.append(jcb44.getSelectedItem() + "碗 ");
                    val4 = 40 * Integer.parseInt(jcb44.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val4) + "元 \n");
                }

                if (jcb5.isSelected()) {
                    jta.append("貢丸湯-$35 ");
                    if (jrb51.isSelected()) {
                        jta.append("加香菜 ");
                    } else if (jrb52.isSelected()) {
                        jta.append("不加香菜 ");
                    }
                    jta.append(jcb55.getSelectedItem() + "碗 ");
                    val5 = 35 * Integer.parseInt(jcb55.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val5) + "元 \n");
                }

                if (jcb6.isSelected()) {
                    jta.append("蛋花湯-$30 ");
                    if (jrb61.isSelected()) {
                        jta.append("加香菜 ");
                    } else if (jrb62.isSelected()) {
                        jta.append("不加香菜 ");
                    }
                    jta.append(jcb66.getSelectedItem() + "碗 ");
                    val6 = 30 * Integer.parseInt(jcb66.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val6) + "元 \n");
                }

                if (jcb7.isSelected()) {
                    jta.append("蛋花湯-$25 ");
                    if (jrb71.isSelected()) {
                        jta.append("加香菜 ");
                    } else if (jrb72.isSelected()) {
                        jta.append("不加香菜 ");
                    }
                    jta.append(jcb77.getSelectedItem() + "碗 ");
                    val7 = 25 * Integer.parseInt(jcb77.getSelectedItem() + "");
                    jta.append("小計 : " + Integer.toString(val7) + "元 \n");
                }
                total = val1 + val2 + val3 + val4 + val5 + val6 + val7;
                jta.append("總計 : "+Integer.toString(total)+"元 \n");
            }
        });
        jbtn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                jta.setText("");
            }
        });
        jbtn3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                Mainframe2.this.dispose();
            }
        });
        jpn3.add(jlb1);
        jpn3.add(jbtn1);
        jpn3.add(jbtn2);
        jpn3.add(jbtn3);
        jpn5.add(jlb2);
        

        jcb11.addItem("1");
        jcb11.addItem("2");
        jcb11.addItem("3");
        jcb11.addItem("4");
        jcb11.addItem("5");
        jcb11.addItem("6");
        bg1.add(jrb11);
        bg1.add(jrb12);
        jpn2.add(jcb1);
        jpn2.add(jcb11);
        jpn2.add(jrb11);
        jpn2.add(jrb12);
        jrb11.setSelected(true);

        jcb22.addItem("1");
        jcb22.addItem("2");
        jcb22.addItem("3");
        jcb22.addItem("4");
        jcb22.addItem("5");
        jcb22.addItem("6");
        bg2.add(jrb21);
        bg2.add(jrb22);
        jpn2.add(jcb2);
        jpn2.add(jcb22);
        jpn2.add(jrb21);
        jpn2.add(jrb22);
        jrb21.setSelected(true);

        jcb33.addItem("1");
        jcb33.addItem("2");
        jcb33.addItem("3");
        jcb33.addItem("4");
        jcb33.addItem("5");
        jcb33.addItem("6");
        bg3.add(jrb31);
        bg3.add(jrb32);
        jpn2.add(jcb3);
        jpn2.add(jcb33);
        jpn2.add(jrb31);
        jpn2.add(jrb32);
        jrb31.setSelected(true);

        jcb44.addItem("1");
        jcb44.addItem("2");
        jcb44.addItem("3");
        jcb44.addItem("4");
        jcb44.addItem("5");
        jcb44.addItem("6");
        bg4.add(jrb41);
        bg4.add(jrb42);
        jpn2.add(jcb4);
        jpn2.add(jcb44);
        jpn2.add(jrb41);
        jpn2.add(jrb42);
        jrb41.setSelected(true);

        jcb55.addItem("1");
        jcb55.addItem("2");
        jcb55.addItem("3");
        jcb55.addItem("4");
        jcb55.addItem("5");
        jcb55.addItem("6");
        bg5.add(jrb51);
        bg5.add(jrb52);
        jpn2.add(jcb5);
        jpn2.add(jcb55);
        jpn2.add(jrb51);
        jpn2.add(jrb52);
        jrb51.setSelected(true);

        jcb66.addItem("1");
        jcb66.addItem("2");
        jcb66.addItem("3");
        jcb66.addItem("4");
        jcb66.addItem("5");
        jcb66.addItem("6");
        bg6.add(jrb61);
        bg6.add(jrb62);
        jpn2.add(jcb6);
        jpn2.add(jcb66);
        jpn2.add(jrb61);
        jpn2.add(jrb62);
        jrb61.setSelected(true);

        jcb77.addItem("1");
        jcb77.addItem("2");
        jcb77.addItem("3");
        jcb77.addItem("4");
        jcb77.addItem("5");
        jcb77.addItem("6");
        bg7.add(jrb71);
        bg7.add(jrb72);
        jpn2.add(jcb7);
        jpn2.add(jcb77);
        jpn2.add(jrb71);
        jpn2.add(jrb72);
        jrb71.setSelected(true);
    }
}