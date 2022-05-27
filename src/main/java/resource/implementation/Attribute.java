package resource.implementation;

import enums.AttributeType;
import resource.DBNode;
import resource.DBNodeComposite;

public class Attribute extends DBNodeComposite {

    private Attribute inRelationWith;
    private int length;
    private AttributeConstraint attributeType;

    public Attribute(String name, DBNode parent){
        super(name, parent);
    }

    public Attribute(String name, DBNode parent, AttributeType attributeType, int length){
        super(name, parent);
        this.length = length;
    }

    @Override
    public void addChild(DBNode child) {
        if(child != null && child instanceof AttributeConstraint){
            AttributeConstraint attributeType = (AttributeConstraint) child;
            this.getChildren().add(attributeType);
        }
    }
}
