package database;

import resource.DBNode;
import resource.data.Row;

import java.util.List;

public class DatabaseImplementation implements Database{
    private Repository repository;


    @Override
    public DBNode loadResource() {
        return repository.getSchema();
    }

    @Override
    public List<Row> readDataFromTable(String tablename) {
        return repository.getRows(tablename);
    }
}
