package controller;

import entities.Authors;
import model.AuthorModel;

import javax.swing.*;

public class AuthorController {

    public static void add() {
        AuthorModel objAuthorModel = new AuthorModel();

        String name = JOptionPane.showInputDialog("Insert the name of the Author:");
        String nationality = JOptionPane.showInputDialog("Insert the Author's nationality");

        Authors author = new Authors();
        author.setName(name);
        author.setNacionality(nationality);

        author = (Authors) objAuthorModel.add(author);
        JOptionPane.showMessageDialog(null,objAuthorModel.toString());
    }

    public static void list(){
        AuthorModel objAuthorModer = new AuthorModel();
        String listAuthors = "CODER LIST\n";

        for (Object iterador: objAuthorModer.findAll()){
            Authors objAuthor = (Authors) iterador;
            listAuthors+= objAuthor.toString() +"\n";
        }
        JOptionPane.showMessageDialog(null, listAuthors);
    }
}


