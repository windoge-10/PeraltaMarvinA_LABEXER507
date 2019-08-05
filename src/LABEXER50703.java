import java.awt.*;

class Lst03 extends Frame {
    List L1;
    Button B1, B2;
    Label Lb;
    Lst03(String s)
    {
        super(s);
        setLayout(new FlowLayout());
        L1 = new List(3,false);
        L1.addItem("Red");
        L1.addItem("Blue");
        L1.addItem("Yellow");
        L1.addItem("Pink");
        L1.addItem("Magenta");
        B1 = new Button("Select");
        B2 = new Button("Reset");
        Lb = new Label("Output here");
        add(L1); add(B1);
        add(B2); layout();
        pack(); show();
    }
    public boolean action(Event e, Object o)
    {
        if ("Select".equals(e.arg))
            if (L1.getSelectedItem() == "Red")
                setBackground(Color.red);
            else if (L1.getSelectedItem() == "Blue")
                setBackground(Color.blue);
            else if (L1.getSelectedItem() == "Yellow")
                setBackground(Color.yellow);
            else if (L1.getSelectedItem() == "Magenta")
                setBackground(Color.magenta);
            else if (L1.getSelectedItem() == "Pink")
                setBackground(Color.pink);
        if ("Reset".equals(e.arg))
            setBackground(Color.white);
        return(super.action(e,e.target));
    }
}
public class LABEXER50703 {
    public static void main(String args[]) {
new Lst03("List");
}
}