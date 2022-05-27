package resource;

import java.util.ArrayList;
import java.util.List;

public abstract class DBNodeComposite extends DBNode{
    private List<DBNode> children;

    public DBNodeComposite(String name, DBNode parent) {
        super(name, parent);
        this.children = new ArrayList<>();
    }

    public DBNodeComposite(String name, DBNode parent, ArrayList<DBNode> children) {
        super(name, parent);
        this.children = children;
    }

    public abstract void addChild(DBNode child);

    public List<DBNode> getChildren(){
        return this.children;
    }

    public DBNode getChildByName(String name) {
        for (DBNode child: this.getChildren()) {
            if (name.equals(child.getName())) {
                return child;
            }
        }
        return null;
    }

}
