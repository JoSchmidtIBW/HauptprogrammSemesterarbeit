package com.example.login;

import java.sql.*;

/**
 * @author - John Schmidt
 * 25.11.2021, 22:21
 */
public class DBMethodenKlasse {

    public void schreibeDB(String url, String user, String password, String einfuegString) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
            Statement statement = connection.createStatement();
            statement.executeQuery(einfuegString);//query
            statement.close();
        } catch (SQLException ex) {
            System.out.println("ex ist gekommen");
            System.out.println(ex.getMessage());
        }
    }


    public void ausgabeNurEineSpalteDB(String url, String user, String password, String ausgebeNurEineSpalteString) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM listlaender");

            while (resultSet.next()) {
                System.out.printf("Land %d: %s%n", resultSet.getInt(1),
                resultSet.getString(ausgebeNurEineSpalteString));
            }
            resultSet.close();
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Exception ist gekommen");
            System.out.println(ex.getMessage());
        }

    }


    public void ausgebenGesamtDB(String url, String user, String password, String ausgebeGesamtString) {
        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ausgebeGesamtString);

            int columns = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columns; i++) {
                System.out.print(String.format("%-20s", resultSet.getMetaData().getColumnName(i)));
            }
            System.out.println();
            System.out.print("-------------------------------------------------------");
            System.out.print("-------------------------------------------------------");
            System.out.print("-------------------------------------------------------");
            System.out.print("-------------------------------------------------------");
            System.out.print("-------------------------------------------------------");
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= 1; i++) {
                    System.out.print(String.format("%-4s", resultSet.getString(i)));
                }
                for (int i = 2; i <= 2; i++) {
                    System.out.print(String.format("%-16s", resultSet.getString(i)));
                }
                for (int i = 3; i <= columns; i++) {
                    System.out.print(String.format("%-32s", resultSet.getString(i)));
                }
                System.out.println();
            }

            resultSet.close();
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Exception ist gekommen");
            System.out.println(ex.getMessage());
        }

    }


}

//    public void zugriffDB(String url,String user,String password, String einfügString){
//
//        try (Connection connection = DriverManager.getConnection(url, user, password)){
//            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
//
//            //Einfügen / Verändern // bei jedesmal play drücken, wird immer wieder eine dazugefügt
//            // String query = "INSERT INTO personen (Vorname, nachname) VALUES ('Hans', 'Mustermann')";
//            //String query = "UPDATE personen SET voname = 'Beate' WHERE persons_id = 6;"
//
//            String query = "INSERT INTO listlaender" +
//                    "(landgeo, officialname, capitalcity, largestcity, areakm, population, callingcode, iso, waehrung)" +
//                    "VALUES  ('Mazedonien', 'Matzda', 'Irgend', 'jijin', '81', '8857', '+4dd3', 'AfffffT', 'Eo');";
//
//            Statement statement = connection.createStatement();
//            statement.executeQuery(einfügString);//query
//            statement.close();
//
//            //--------------------------------------------------------------------
//            //Ausgeben
//            /*String*/
//            //String
//            String       query1 = "SELECT * FROM listlaender";//officialname
//            /*Statement*/
//            statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(query1);
//
//            int columns = resultSet.getMetaData().getColumnCount();
//            for(int i = 1; i<=columns; i++){
//                System.out.print(String.format("%-20s", resultSet.getMetaData().getColumnName(i)));
//            }
//            System.out.println();
//            System.out.println("-------------------------------------------------------");
//
////            int x = 0;
////            for(int i = 1; i<=columns;i++){
////                x= resultSet.getString(i).length();
////            }
////            System.out.println("x= "+x);
//            while(resultSet.next()){
//                for(int i = 1; i<=1;i++){
//                    System.out.print(String.format("%-4s",resultSet.getString(i)));
//                }
//                for(int i = 2; i<=2;i++){
//                    System.out.print(String.format("%-16s",resultSet.getString(i)));
//                }
//                for(int i = 3; i<=columns;i++){
//                    System.out.print(String.format("%-32s",resultSet.getString(i)));
//                }
//                System.out.println();
//            }
//
//            resultSet.close();
//            statement.close();
//
//        } catch (SQLException ex) {
//            System.out.println("ex ist gekommen");
//            System.out.println(ex.getMessage());
//        }


// }






