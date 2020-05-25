package vn.amabuy.jdbc;
import java.sql.*;

public class MyDBConnect {
    public static void main(String[] args) throws SQLException {

        try {
            String dbURL = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=localhost)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=orcl)))";
            String strUserID = "system";
            String strPassword = "123456";
            Connection myConnection=DriverManager.getConnection(dbURL,strUserID,strPassword);

            Statement sqlStatement = myConnection.createStatement();
            String readRecordSQL = "select * from DEPARTMENT ";
            ResultSet myResultSet = sqlStatement.executeQuery(readRecordSQL);
            while (myResultSet.next()) {
                System.out.println("Record values: " + myResultSet.getString("DEPT_NAME"));
            }
            myResultSet.close();
            myConnection.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
