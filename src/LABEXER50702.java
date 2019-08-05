import java.awt.*;
import java.awt.event.*;
class ConvertTemperatures extends Frame implements ActionListener,
        WindowListener {
    Label directions;
    TextField fahrenheit;
    Label celsius;
    ConvertTemperatures(String s)
    {
        super(s);
        setSize(250,100);
        setLayout(new FlowLayout());
        addWindowListener(this);
        directions = new Label("Enter temperature in Fahrenheit: ");
        add(directions);
        fahrenheit = new TextField(2);
        add(fahrenheit);
        fahrenheit.addActionListener(this);
        celsius = new Label("");
        celsius.setFont(new Font("TimesRoman 12 point bold.",20,20));
        add(celsius);
        show();
    }
    public void windowClosed(WindowEvent event) {}
    public void windowDeiconified(WindowEvent event) {}
    public void windowIconified(WindowEvent event) {}
    public void windowActivated(WindowEvent event) {}
    public void windowDeactivated(WindowEvent event) {}
    public void windowOpened(WindowEvent event) {}
    public void windowClosing(WindowEvent event)
    {
        System.exit(0);
    }
    public void actionPerformed(ActionEvent event)
    {
        int f = Integer.parseInt(fahrenheit.getText());
        long c = Math.round(5.0*(f-32)/9.0);
        fahrenheit.setText("");
        celsius.setText(f+"\u00B0F = "+c+"\u00B0C");
    }
}
public class LABEXER50702 {
    public static void main(String args[])
    {
        new ConvertTemperatures("Example");
    }
}