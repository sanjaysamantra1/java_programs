
import javax.swing.*;


public class Submenutest extends JFrame
{

    public Submenutest()
    {
        JMenuBar menubar = new JMenuBar();

        JMenu file = new JMenu("File");


        JMenu imp = new JMenu("Import");

        JMenuItem newsf = new JMenuItem("Import newsfeed list...");
        JMenuItem bookm = new JMenuItem("Import bookmarks...");
        JMenuItem mail = new JMenuItem("Import mail...");

        imp.add(newsf);
        imp.add(bookm);
        imp.add(mail);

        JMenuItem fileNew = new JMenuItem("New", iconNew);


        JMenuItem fileOpen = new JMenuItem("Open", iconOpen);


        JMenuItem fileSave = new JMenuItem("Save", iconSave);

        JMenuItem fileExit = new JMenuItem("Exit", iconExit);

        fileExit.setToolTipText("Exit application");


        file.add(fileNew);
        file.add(fileOpen);
        file.add(fileSave);
        file.addSeparator();
        file.add(imp);
        file.addSeparator();
        file.add(fileExit);

        menubar.add(file);

        setJMenuBar(menubar);

        setTitle("Submenu");
        setSize(360, 250);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args)
    {

                Submenutest ex = new Submenutest();
                ex.setVisible(true);

    }
}