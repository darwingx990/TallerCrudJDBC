import database.ConfigDB;
import model.AuthorModel;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        ConfigDB.openConnection();
        String option = "";

        do {
            option = JOptionPane.showInputDialog("""
                    1. List Authors.
                    2. Insert Author.
                    3. Update Author.
                    4. Delete Author.
                    5. Get coder by ID.
                    6. Exit
                                        
                    Choose an option:
                    """);

            switch (option){
                case "1":

            }
        } while (!option.equals("6"));

    }
}