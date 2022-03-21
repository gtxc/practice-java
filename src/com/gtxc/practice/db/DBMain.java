package com.gtxc.practice.db;

/*
    Created by gt at 5:34 PM on Friday, February 25, 2022.
    Project: practice, Package: com.gtxc.practice.db.
*/


import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBMain {

    public static void main(String[] args) {

        String queryAllRowsTestTable = "SELECT * FROM test_table";
        String insertTestTable = "INSERT INTO TEST_TABLE(DATA) VALUES('ww')";
        String prInsertTestTable = "INSERT INTO TEST_TABLE(DATA) VALUES(?)";
        String update = "UPDATE TEST_TABLE SET DATA='QWEQ' WHERE ID=1";
        String prUpdate = "UPDATE TEST_TABLE SET DATA=? WHERE ID=?";
        String delete = "DELETE FROM TEST_TABLE WHERE id=10";

        if (DBConnection.getConnection("jdbc:sqlite:testdb")) {
            System.out.println("opened.");
        }

        try {
            Statement st = DBConnection.connection.createStatement();
//            DBConnection.connection.setAutoCommit(false);   // to commit changes after all statements run
//            ResultSet rs = st.executeQuery(queryAllRowsTestTable);
//            rs.next();
//            System.out.println(rs.getInt("id") + " " + rs.getString("data"));
//            rs.next();
//            System.out.println(rs.getInt("id") + " " + rs.getString("data"));

//            st.executeUpdate(insertTestTable);
//            st.executeUpdate(update);
            st.executeUpdate(delete);
            st.close();


            PreparedStatement prSt = DBConnection.connection.prepareStatement(prUpdate);
//            prSt.setString(1, "gturkarslan");
//            prSt.executeUpdate();
//            prSt.executeUpdate(prUpdate);

//            prSt.setString(1, "ggwp");
//            prSt.setInt(2, 5);
//            prSt.executeUpdate();
//            prSt.close();
//            DBConnection.connection.commit();   // commit DB changes


        } catch (SQLException e) {
            e.printStackTrace();
        }


        if (DBConnection.closeConnection()) {
            System.out.println("closed.");
        }
    }
}
