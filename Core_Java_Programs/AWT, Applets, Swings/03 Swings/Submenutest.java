
import javax.swing.*;

public class Submenutest extends JFrame
{

    public Submenutest()
    {
        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");
        JMenu edit = new JMenu("Edit");



		 JMenu n= new JMenu("New");

        JMenuItem i1= new JMenuItem("JAVA");
        JMenuItem i2= new JMenuItem("C++");
        JMenuItem i3= new JMenuItem("C");

        n.add(i1);
        n.add(i2);
        n.add(i3);


       JMenuItem imp = new JMenuItem("Import");

        JMenuItem op= new JMenuItem("Open");


        JMenuItem sv= new JMenuItem("Save");

        JMenuItem ext= new JMenuItem("Exit");

        ext.setToolTipText("Exit application");


        file.add(n);
        file.add(op);
        file.add(sv);
        file.addSeparator();
        file.add(imp);
        file.addSeparator();
        file.add(ext);

        menubar.add(file);
        menubar.add(edit);

        setJMenuBar(menubar);

        setTitle("Submenu");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

                Submenutest obj= new Submenutest();
                obj.setVisible(true);

    }
}