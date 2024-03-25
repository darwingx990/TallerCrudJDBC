package model;

import database.CRUD;
import database.ConfigDB;
import entities.Authors;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorModel implements CRUD {

    @Override
    public Object add(Object obj) {
        Authors objAuthor = (Authors) obj;

        try {
        Connection objConnection = ConfigDB.openConnection();
            String sql = "INSERT INTO autores (name, nacionality) VALUES (?, ?);";

            PreparedStatement objPrepare = objConnection.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            objPrepare.setString(1, objAuthor.getName());
            objPrepare.setString(2, objAuthor.getNacionality());

            objPrepare.execute();
            ResultSet objRS = objPrepare.getGeneratedKeys();

            while (objRS.next()) {
                objAuthor.setId(objRS.getInt(1));
            }
            JOptionPane.showMessageDialog(null, "Author was added successful.  ");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error >> " + e.getMessage());

        }

//        ConfigDB.closeConnection();

        return objAuthor;
    }

    @Override
    public boolean update(Object obj) {
        return false;
    }

    @Override
    public List<Object> findAll() {
        List<Object> authorlist = new ArrayList<>();
        Connection connection = ConfigDB.openConnection();
        try {
            String sql = "SELECT * FROM autores;";

            PreparedStatement objPrepare = connection.prepareStatement(sql);

            ResultSet objRS = objPrepare.executeQuery();

            while (objRS.next()) {
                Authors objautor = new Authors();
                objautor.setId(objRS.getInt("id"));
                objautor.setName(objRS.getString("name"));
                objautor.setNacionality(objRS.getString("nacionality"));

                authorlist.add(objautor);
            }


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error >> " + e.getMessage());
        }
//        ConfigDB.closeConnection();
        return authorlist;
    }

    @Override
    public boolean delete(Object obj) {
        Authors objAuthor = (Authors) obj;
        Connection connection = ConfigDB.openConnection();
        boolean isDeleted = false;

        try {
            String sql = "DELETE FROM autores WHERE id =?;";
            PreparedStatement objPrepare = connection.prepareStatement(sql);
            objPrepare.setInt(1, objAuthor.getId());
            int totalRowsAffected = objPrepare.executeUpdate();

            if (totalRowsAffected > 0) {
                isDeleted = true;
                JOptionPane.showMessageDialog(null, "The update was done successfully.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error >> " + e.getMessage());
        }

        ConfigDB.closeConnection();
        return isDeleted;
    }
}
