package view;

import actions.ActionManager;
import gui.MyMenu;
import gui.MyToolbar;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static MainFrame instance=null;
    private ActionManager actionManager;

    private MyMenu meni;
    private MyToolbar toolbar;

    private JPanel panelLevi;
    private JPanel panelDesni;

    private JSplitPane splitPane;
    private JScrollPane scrollPane;

    private JTextArea textArea;
    private JTable table;

    private MainFrame(){
    }

    private void initialise(){
        actionManager=new ActionManager();
    }
    private void initialiseGUI(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenDimension = toolkit.getScreenSize();
        int screenWidth = screenDimension.width;
        int screenHeight = screenDimension.height;

        setSize(screenWidth / 2, screenHeight / 2);
        this.setTitle("Database");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        this.meni = new MyMenu();
        this.toolbar = new MyToolbar();

        this.setJMenuBar(meni);

        this.panelDesni = new JPanel();
        panelDesni.setLayout(new BorderLayout());
        panelDesni.setBackground(Color.RED);

        JPanel queryPanel = new JPanel(new BorderLayout());
        queryPanel.setMaximumSize(new Dimension(100,50));
        queryPanel.setMinimumSize(new Dimension(100,50));

        this.textArea = new JTextArea("Unesi svoj SQL statement",2, 20);
        this.textArea.setMaximumSize(new Dimension(50, 50));
        this.textArea.setMaximumSize(new Dimension(50, 50));

        queryPanel.add(textArea, BorderLayout.CENTER);

        this.panelLevi = new JPanel();
        panelLevi.setLayout(new BorderLayout());
        panelLevi.setBackground(Color.BLUE);

        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, panelLevi, panelDesni);
        splitPane.setDividerLocation(200);
        splitPane.setOneTouchExpandable(true);

        this.add(splitPane, BorderLayout.CENTER);
        this.add(toolbar, BorderLayout.NORTH);

        validate();
        revalidate();
    }

    public static MainFrame getInstance(){
        if(instance==null) {
            instance = new MainFrame();
            instance.initialise();
            instance.initialiseGUI();
        }
        return instance;
    }

    public ActionManager getActionManager() {
        return actionManager;
    }
}
