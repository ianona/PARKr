package testcase;

import java.sql.*;

public class query {

    String url = "jdbc:mysql://localhost:3306/events?autoReconnect=true&useSSL=false";
    String user = "root";
    String password = "bacon";

    public query() {

    }

    public void readSQL() {

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from quickr.stores order by queue");

            while (rs.next()) {
                System.out.println(rs.getString("Name") + " " + rs.getString("Mall") + " " + rs.getInt("Queue"));
                String name = rs.getString("Name");
                String mall = rs.getString("Mall");
                int queue = rs.getInt("Queue");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void addItemSQL(String name, String mall, int queue) {

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String insert = "Insert quickr.stores" + "(Name, Mall, Queue)" + "Values ('" + name + "','" + mall + "','" + queue + "')";
            statement.executeUpdate(insert);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void decrementQueueSQL(String name, String mall) {

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String insert = "Update quickr.stores SET Queue = Queue - 1 WHERE Mall = " + "'" + mall + "' " + " AND Name = " + "'" + name + "'" + ";";
            statement.executeUpdate(insert);

        } catch (Exception e) {

        }
    }

    public void incrementQueueSQL(String name, String mall) {

        try {
            Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement();

            String insert = "Update quickr.stores SET Queue = Queue + 1 WHERE Mall = " + "'" + mall + "' " + " AND Name = " + "'" + name + "'" + ";";
            statement.executeUpdate(insert);

        } catch (Exception e) {

        }
    }

}
