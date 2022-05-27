package gui;

import view.MainFrame;

import javax.swing.*;

public class MyToolbar extends JToolBar {

    public MyToolbar(){
        super(HORIZONTAL);
        setFloatable(false);

        this.add(MainFrame.getInstance().getActionManager().getBulkImportAction());
        this.addSeparator();
        this.add(MainFrame.getInstance().getActionManager().getExportAction());
        this.addSeparator();
        this.add(MainFrame.getInstance().getActionManager().getPrettyAction());
        this.addSeparator();
        this.add(MainFrame.getInstance().getActionManager().getRunAction());
    }

}
