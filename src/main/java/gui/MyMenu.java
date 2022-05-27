package gui;

import view.MainFrame;

import javax.swing.*;

public class MyMenu extends JMenuBar {

    public MyMenu(){
        JMenu options = new JMenu("Options");

        options.add(MainFrame.getInstance().getActionManager().getBulkImportAction());
        options.add(MainFrame.getInstance().getActionManager().getExportAction());
        options.add(MainFrame.getInstance().getActionManager().getPrettyAction());
        options.add(MainFrame.getInstance().getActionManager().getRunAction());

        this.add(options);
    }

}
