package edu.albany.cubism.sentiment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Query {

    private Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    DbUtil dbU = null;

    public Query() {
        connect();
    }

    public Query(String q, String... params) {
        connect();
        executeQuery(q, params);
    }

    public Query(String q, Object... params) {
        connect();
        executeQuery(q, params);
    }

    public boolean connect() {
        dbU = new DbUtil();
        try {
            con = dbU.getConnection();
            return true;
        } catch (Exception e) {
            System.err.println("Error getting database connection.");
            e.printStackTrace();

            return false;
        }
    }

    public boolean close() {
        try {
            if (!ps.isClosed()) {
                ps.close();
            }
            if (!rs.isClosed()) {
                rs.close();
            }
            con.close();
        } catch (SQLException e) {
            System.err.println("Error closing connection to database");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public String getString(String column) {
        try {
            return rs.getString(column);
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
            return null;
        }
    }

    public String getString(int col) {
        try {
            return rs.getString(col);
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
            return null;
        }
    }

    public boolean next() {
        try {
            return rs.next();
        } catch (SQLException e) {
            System.err.println("Error getting next result.");
            return false;
        }
    }

    public boolean executeQuery(String query, String... params) {
        try {
//                            System.out.println("query: " + query);
            ps = con.prepareStatement(query);
            int p = 1;
            for (String param : params) {
                ps.setString(p++, param);
            }
            // System.out.println(ps.toString());
            rs = ps.executeQuery();
            return true;
        } catch (SQLException e) {
            System.err.println("Error with query.");
            e.printStackTrace();
        }
        return false;
    }

    public boolean executeQuery(String query, Object... params) {
        try {
            ps = con.prepareStatement(query);
            int p = 1;
            for (Object param : params) {
                ps.setObject(p++, param);
            }
            // System.out.println(ps.toString());
            rs = ps.executeQuery();
            return true;
        } catch (SQLException e) {
            System.err.println("Error with query.");
            e.printStackTrace();
        }
        return false;
    }

    public boolean closeQueryStream() {
        try {
            ps.close();
            rs.close();
            return true;
        } catch (SQLException e) {
            System.err.println("Error closing query stream.");
            e.printStackTrace();
            return false;
        }

    }

    public double getDouble(String column) {
        try {
            return rs.getDouble(column);
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
            return -1;
        }
    }

    public double getDouble(int col) {
        try {
            return rs.getDouble(col);
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
            return -1;
        }
    }

    public int getInteger(String column) {
        try {
            return rs.getInt(column);
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
            return -1;
        }
    }

    public int getInteger(int col) {
        try {

            return rs.getInt(col);
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
            return -1;
        }
    }

    public Object getObject(String column) {
        try {
            return rs.getObject(column);
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
            return null;
        }
    }

    public Object getObject(int col) {
        try {
            return rs.getObject(col);
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
            return null;
        }
    }

    public void printRow() {
        try {
            for (int i = 1; i < rs.getMetaData().getColumnCount() + 1; i++) {
                System.out.print(rs.getMetaData().getColumnName(i) + ": " + rs.getString(i) + " ");
            }
            System.out.println();
        } catch (SQLException e) {
            System.err.println("Error printing row.");
            e.printStackTrace();
        }
    }

    public ArrayList<Object> getRowAsArray() {
        ArrayList<Object> row = new ArrayList<Object>();
        try {
            for (int i = 1; i < rs.getMetaData().getColumnCount() + 1; i++) {
                row.add(rs.getString(i));
            }
        } catch (SQLException e) {
            System.err.println("Error getting data.");
            e.printStackTrace();
        }
        return row;
    }
}
