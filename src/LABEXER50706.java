import java.awt.*;
import java.awt.event.*;
class Menus extends Frame {
    Frame theFrame;
    MenuBar menu1;
    Menu area;
    Label A;
    Menus(String s)
    {
        super(s);
        theFrame = new Frame();
        setLayout(new BorderLayout());
        setSize(500,500);
        menu1 = new MenuBar();
        setMenuBar(menu1);
        area = new Menu("Area");
        menu1.add(area);
        area.add("Square");
        area.add("Rectangle");
        area.add("Circle");
        show();
    }
    class LoginDialog extends Dialog {
        Frame frameRef;

        LoginDialog(Frame fr, String title, boolean modal) {
            super(fr, title, modal);
            frameRef = fr;
        }
    }
    public boolean action(Event e, Object o) {
        if ("Square".equals(e.arg))
            new Area_Square();
        else if ("Circle".equals(e.arg))
            new Area_Circle();
        else new Area_Rectangle();
        return(super.action(e,e.target));
    }
    class Area_Square extends Frame implements ActionListener
    {
        Button q1, q2, q3;
        Label s1;
        TextField p2;
        Dialog loginDialog;
        Area_Square()
        {
            loginDialog = new LoginDialog(theFrame, "Area of Square",true);
            loginDialog.setLayout(new GridLayout(3,1));
            Panel p = new Panel();
            p.setLayout(new FlowLayout());
            Label p1 = new Label("Enter side: ");
            p2 = new TextField(10);
            p.add(p1); p.add(p2);
            Panel q = new Panel();
            q.setLayout(new FlowLayout());
            q1 = new Button("Compute");
            q1.addActionListener(this);
            q2 = new Button("Clear");
            q2.addActionListener(this);
            q3 = new Button("Exit");
            q3.addActionListener(this);
            q.add(q1); q.add(q2); q.add(q3);
            s1 = new Label("");
            loginDialog.add(p);
            loginDialog.add(s1);
            loginDialog.add(q);
            loginDialog.setLocation(100,100);
            loginDialog.setSize(300,200);
            loginDialog.show();
        }
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == q1)
            {
                double i = Double.parseDouble(p2.getText());
                double a = i * i;
                s1.setAlignment(1);
                s1.setFont(new Font("Arial",Font.BOLD,14));
                s1.setText("The Area of Square is: "+a);
            }
            else if (event.getSource() == q2)
            {
                s1.setText("");
                p2.setText("");
            }
            else loginDialog.dispose();
        } }
    class Area_Circle extends Frame implements ActionListener
    {
        Button q1, q2, q3;
        Label s1;
        TextField p2;
        Dialog loginDialog;
        Area_Circle()
        {
            loginDialog = new LoginDialog(theFrame, "Area of Circle",true);
            loginDialog.setLayout(new GridLayout(3,1));
            Panel p = new Panel();
            p.setLayout(new FlowLayout());
            Label p1 = new Label("Enter radius: ");
            p2 = new TextField(10);
            p.add(p1); p.add(p2);
            Panel q = new Panel();
            q.setLayout(new FlowLayout());
            q1 = new Button("Compute");
            q1.addActionListener(this);
            q2 = new Button("Clear");
            q2.addActionListener(this);
            q3 = new Button("Exit");
            q3.addActionListener(this);
            q.add(q1); q.add(q2); q.add(q3);
            s1 = new Label("");
            loginDialog.add(p);
            loginDialog.add(s1);
            loginDialog.add(q);
            loginDialog.setLocation(100,100);
            loginDialog.setSize(300,200);
            loginDialog.show();
        }
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == q1)
            {
                double i = Double.parseDouble(p2.getText());
                double a = 3.1416 * i * i;
                s1.setAlignment(1);
                s1.setFont(new Font("Arial",Font.BOLD,14));
                s1.setText("The Area of Circle is: "+a);
            }
            else if (event.getSource() == q2)
            {
                s1.setText("");
                p2.setText("");
            }
            else loginDialog.dispose();
        }
    }
    class Area_Rectangle extends Frame implements ActionListener
    {
        Button q1, q2, q3;
        Label s1;
        TextField p2, p3;
        Dialog loginDialog;
        Area_Rectangle() {
            loginDialog = new LoginDialog(theFrame, "Area of Rectangle", true);
            loginDialog.setLayout(new GridLayout(3, 1));
            Panel p = new Panel();
            p.setLayout(new GridLayout(2, 2));
            Label p1 = new Label("Enter length: ");
            p2 = new TextField();
            Label p4 = new Label("Enter width: ");
            p3 = new TextField();
            p.add(p1);
            p.add(p2);
            p.add(p4);
            p.add(p3);
            Panel q = new Panel();
            q.setLayout(new FlowLayout());
            q1 = new Button("Compute");
            q1.addActionListener(this);
            q2 = new Button("Clear");
            q2.addActionListener(this);
            q3 = new Button("Exit");
            q3.addActionListener(this);
            q.add(q1);
            q.add(q2);
            q.add(q3);
            s1 = new Label("");
            loginDialog.add(p);
            loginDialog.add(s1);
            loginDialog.add(q);
            loginDialog.setLocation(100, 100);
            loginDialog.setSize(300, 200);
            loginDialog.show();
        }
        public void actionPerformed(ActionEvent event)
        {
            if (event.getSource() == q1)
            {
                double i = Double.parseDouble(p2.getText());
                double j = Double.parseDouble(p3.getText());
                double a = i * j;
                s1.setAlignment(1);
                s1.setFont(new Font("Arial",Font.BOLD,14));
                s1.setText("The Area of Rectangle is: "+a); }
            else if (event.getSource() == q2)
            {
                s1.setText("");
                p2.setText("");
                p3.setText("");
            }
            else loginDialog.dispose(); } }
    public boolean handleEvent (Event e) {
        if (e.id == Event.WINDOW_DESTROY) {
            hide();
            System.exit(0);
        }
        return(super.handleEvent(e));
    }
}
public class LABEXER50706 {
    public static void main(String args[]) {
        new Menus("Dialogs");
    }
}