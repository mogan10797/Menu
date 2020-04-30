import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;



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
    private JButton jbtn1 = new JButton();
    private JButton jbtn2 = new JButton();
    private JButton jbtn3 = new JButton();
    private JTextArea jta=new JTextArea();
    private JScrollBar jsb=new JScrollBar();

    private JCheckBox jcb1 = new JCheckBox("牛肉蛋花湯");
    private JComboBox jcb11 = new JComboBox<Integer>();
    private JRadioButton jrb11 = new JRadioButton("加香菜");
    private JRadioButton jrb12 = new JRadioButton("不加香菜");

    private JCheckBox jcb2 = new JCheckBox("牛肉湯");
    private JComboBox jcb22 = new JComboBox<Integer>();
    private JRadioButton jrb21 = new JRadioButton("加香菜");
    private JRadioButton jrb22 = new JRadioButton("不加香菜");

    private JCheckBox jcb3 = new JCheckBox("牛肉清湯加蛋花");
    private JComboBox jcb33 = new JComboBox<Integer>();
    private JRadioButton jrb31 = new JRadioButton("加香菜");
    private JRadioButton jrb32 = new JRadioButton("不加香菜");

    private JCheckBox jcb4 = new JCheckBox("餛飩湯");
    private JComboBox jcb44 = new JComboBox<Integer>();
    private JRadioButton jrb41 = new JRadioButton("加香菜");
    private JRadioButton jrb42 = new JRadioButton("不加香菜");

    private JCheckBox jcb5 = new JCheckBox("貢丸湯");
    private JComboBox jcb55 = new JComboBox<Integer>();
    private JRadioButton jrb51 = new JRadioButton("加香菜");
    private JRadioButton jrb52 = new JRadioButton("不加香菜");

    private JCheckBox jcb6 = new JCheckBox("蛋花湯");
    private JComboBox jcb66 = new JComboBox<Integer>();
    private JRadioButton jrb61 = new JRadioButton("加香菜");
    private JRadioButton jrb62 = new JRadioButton("不加香菜");

    private JCheckBox jcb7 = new JCheckBox("青菜湯");
    private JComboBox jcb77 = new JComboBox<Integer>();
    private JRadioButton jrb71 = new JRadioButton("加香菜");
    private JRadioButton jrb72 = new JRadioButton("不加香菜");

    private ButtonGroup bg1=new ButtonGroup();
    private ButtonGroup bg2=new ButtonGroup();
    private ButtonGroup bg3=new ButtonGroup();
    private ButtonGroup bg4=new ButtonGroup();
    private ButtonGroup bg5=new ButtonGroup();
    private ButtonGroup bg6=new ButtonGroup();
    private ButtonGroup bg7=new ButtonGroup();

    public Mainframe2() {
        init();
    }

    public void init() {
this.setTitle("Soup");
this.setBounds(200, 300, 500, 600);
this.setDefaultCloseOperation(EXIT_ON_CLOSE);
cp.add(jpn1,BorderLayout.SOUTH);
jpn1.add(jpn2,BorderLayout.CENTER);
jpn1.add(jpn3,BorderLayout.SOUTH);













jpn3.add(jbtn1);
jpn3.add(jbtn2);
jpn3.add(jbtn3);

bg1.add(jrb11);
bg1.add(jrb12);
jpn2.add(jcb1);
jpn2.add(jcb11);
jpn2.add(jrb11);
jpn2.add(jrb12);

bg2.add(jrb21);
bg2.add(jrb22);
jpn2.add(jcb2);
jpn2.add(jcb22);
jpn2.add(jrb21);
jpn2.add(jrb22);

bg3.add(jrb31);
bg3.add(jrb22);
jpn2.add(jcb3);
jpn2.add(jcb33);
jpn2.add(jrb31);
jpn2.add(jrb32);

bg4.add(jrb41);
bg4.add(jrb42);
jpn2.add(jcb4);
jpn2.add(jcb44);
jpn2.add(jrb41);
jpn2.add(jrb42);

bg5.add(jrb51);
bg5.add(jrb52);
jpn2.add(jcb5);
jpn2.add(jcb55);
jpn2.add(jrb51);
jpn2.add(jrb52);

bg6.add(jrb61);
bg6.add(jrb62);
jpn2.add(jcb6);
jpn2.add(jcb66);
jpn2.add(jrb61);
jpn2.add(jrb62);

bg7.add(jrb71);
bg7.add(jrb72);
jpn2.add(jcb7);
jpn2.add(jcb77);
jpn2.add(jrb71);
jpn2.add(jrb72);
    }
}