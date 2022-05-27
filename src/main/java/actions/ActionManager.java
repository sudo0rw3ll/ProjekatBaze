package actions;

public class ActionManager {
    private PrettyAction prettyAction;
    private ExportAction exportAction;
    private BulkImportAction bulkImportAction;
    private RunAction runAction;

    public ActionManager(){
        init();
    }
    private void init(){
        this.bulkImportAction=new BulkImportAction();
        this.exportAction=new ExportAction();
        this.prettyAction=new PrettyAction();
        this.runAction=new RunAction();
    }

    public PrettyAction getPrettyAction() {
        return prettyAction;
    }

    public ExportAction getExportAction() {
        return exportAction;
    }

    public BulkImportAction getBulkImportAction() {
        return bulkImportAction;
    }

    public RunAction getRunAction() {
        return runAction;
    }
}
