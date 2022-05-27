package database;

import database.settings.Settings;
import resource.DBNode;
import resource.data.Row;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class MYSQLrepository implements Repository{

    private Settings settings;
    private Connection connection;

    public MYSQLrepository(Settings settings){
        this.settings=settings;
    }

    private void initConnection() throws SQLException, ClassNotFoundException{
        String ip=(String) settings.getParameter("mysql_ip");
    }
    @Override
    public DBNode getSchema() {
        return null;
    }

    @Override
    public List<Row> getRows(String tableName) {
        return null;
    }
}
