package actions;

import java.awt.event.ActionEvent;

public class RunAction extends MyAction{
    public RunAction(){
        putValue(NAME,"Run");
        putValue(SHORT_DESCRIPTION,"Run SQL Query");
        putValue(SMALL_ICON,loadIcon("images/export.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Run Action");
    }
}
