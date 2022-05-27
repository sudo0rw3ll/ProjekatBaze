package resource;

public abstract class DBNode {
    private String name;
    private DBNode parent;

    public DBNode(String name, DBNode parent){
        this.name = name;
        this.parent = parent;
    }

    public boolean equals(Object obj) {
        if (obj != null && obj instanceof DBNode) {
            DBNode otherObj = (DBNode) obj;
            return this.getName().equals(otherObj.getName());
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
