package actions;

import java.awt.event.ActionEvent;

public class ExportAction extends MyAction{

    public ExportAction(){
        putValue(NAME,"Export CSV");
        putValue(SHORT_DESCRIPTION,"Exports table to csv file");
        putValue(SMALL_ICON, loadIcon("C:\\Users\\Vid\\Documents\\ProjekatBaze\\src\\main\\java\\actions\\icons\\export.png"));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Export");
    }
}
