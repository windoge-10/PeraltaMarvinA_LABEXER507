import java.awt.*;
import java.awt.event.*;
class Lst04 extends Frame implements ActionListener {
    List L1;
    Lst04(String s)
    {
        super(s);
        setLayout(new FlowLayout());
        L1 = new List(3,false);
        L1.addActionListener(this);
        L1.addItem("Red");
        L1.addItem("Blue");
        L1.addItem("Yellow");
        L1.addItem("Pink");
        L1.addItem("Magenta");
        add(L1);
        layout();
        pack();
        show();
    }
    public void actionPerformed(ActionEvent event) {
    String s1 = L1.getSelectedItem();
if(event.getActionCommand().equals(s1))
            if (s1=="Red")
                setBackground(Color.red);
            else if (s1=="Blue")
                setBackground(Color.blue);
            else if (s1=="Yellow")
                setBackground(Color.yellow);
            else if (s1=="Magenta")
                setBackground(Color.magenta);
            else if (s1=="Pink")
                setBackground(Color.pink);
    }
}
public class LABEXER50704 {
    public static void main(String args[]) {
new Lst04("List");
}
}