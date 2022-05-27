package resource.implementation;

import enums.ConstraintType;
import resource.DBNode;

public class AttributeConstraint extends DBNode {
    private ConstraintType constraintType;

    public AttributeConstraint(String name, DBNode parent, ConstraintType constraintType){
        super(name, parent);
        this.constraintType = constraintType;
    }
}
