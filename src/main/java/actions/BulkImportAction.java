package actions;

import java.awt.event.ActionEvent;

public class BulkImportAction extends MyAction{
    public BulkImportAction(){
        putValue(NAME,"Bulk Import");
        putValue(SHORT_DESCRIPTION,"Import info");
        putValue(SMALL_ICON, loadIcon("C:\\Users\\Vid\\Documents\\ProjekatBaze\\src\\main\\java\\actions\\icons\\export.png"));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("BULK");
    }
}
