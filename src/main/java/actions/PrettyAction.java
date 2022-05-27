package actions;

import java.awt.event.ActionEvent;

public class PrettyAction extends MyAction{
    public PrettyAction(){
        putValue(NAME,"Pretty");
        putValue(SHORT_DESCRIPTION,"Format Text Area");
        putValue(SMALL_ICON, loadIcon("C:\\Users\\Vid\\Documents\\ProjekatBaze\\src\\main\\java\\actions\\icons\\export.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Pretty Jovana");
    }
}
