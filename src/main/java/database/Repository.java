package database;

import resource.DBNode;
import resource.data.Row;

import java.awt.*;
import java.util.List;

public interface Repository {
    DBNode getSchema();

    List<Row> getRows(String tableName);
}
