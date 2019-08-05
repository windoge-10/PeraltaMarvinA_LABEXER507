import java.awt.*;
import java.awt.event.*;
class LChoice extends Frame implements ActionListener {
    Choice entree, dessert;
    List beverage, orders;
    Button b1, b2;
    LChoice(String s) {
        super(s);
        setLayout(new GridLayout(2, 1));
        setSize(500, 200);
        Panel p1 = new Panel();
        p1.setLayout(new GridLayout(1, 3));
        orders = new List();
        entree = new Choice();
        entree.addItem("Golden Fried Shrimp");
        entree.addItem("Beef with Oyster Sauce");
        entree.addItem("Calamares");
        entree.addItem("Chicken Curry");
        entree.addItem("Lengua");
        dessert = new Choice();
        dessert.addItem("Blueberry Cheesecake");
        dessert.addItem("Apple Pie");
        dessert.addItem("Sansrival");
        dessert.addItem("Leche Flan");
        dessert.addItem("Chocolate Mousse");
        beverage = new List(0, false);
        beverage.addItem("Beers");
        beverage.addItem("Rhum");
        beverage.addItem("Wines");
        beverage.addItem("Coffee/Tea");
        beverage.addItem("Juices");
        beverage.addItem("Vodka");
        beverage.addItem("Zombie");
        beverage.addItem("Mineral Water");
        Panel q = new Panel();
        q.setLayout(new FlowLayout());
        b1 = new Button("Add Orders");
        b1.addActionListener(this);
        b2 = new Button("Remove Orders");
        b2.addActionListener(this);
        q.add(b1);
        q.add(b2);
        Panel p = new Panel();
        p.setLayout(new GridLayout(2, 1));
        p.add(entree);
        p.add(dessert);
        p1.add(p);
        p1.add(beverage);
        p1.add(orders);
        add(p1);
        add(q);
        layout();
        show();
    }
        public void actionPerformed(ActionEvent event) {
            String s1, s2, s3;
            if (event.getSource() == b1)
            {
                s1 = new String(entree.getSelectedItem());
                orders.addItem(s1);
                s2 = new String(dessert.getSelectedItem());
                orders.addItem(s2);
                s3 = new String(beverage.getSelectedItem());
                orders.addItem(s3);
            }
            else if (event.getSource() == b2)
                orders.removeAll();
            entree.select(0);
            dessert.select(0);
            beverage.select(0);
        }
    {
    }
}
public class LABEXER50705 {
    public static void main(String args[]) {
new LChoice("Restaurant Menu");
}
}