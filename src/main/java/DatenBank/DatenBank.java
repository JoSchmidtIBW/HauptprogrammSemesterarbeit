package DatenBank;


import java.sql.*;

/**
 * @author - John Schmidt
 * 25.11.2021, 22:21
 */
public class DatenBank {

    public String getUrl1() {
        return url1;
    }

    public String getUser1() {
        return user1;
    }

    public String getPassword1() {
        return password1;
    }

    private String url1 = "jdbc:mariadb://localhost:3306/mubeaDataBase";//name von "database liste"         //MubeaListeDatabase
    private String user1 = "root";
    private String password1 = "Mubea2020!";


//----------------------------------------------------------------------------------------------------------------------
//    String LoginSucheVornameMitNameAusDB;
//
//    public String getLoginSucheVornameMitNameAusDB() {
//        return LoginSucheVornameMitNameAusDB;
//    }
//
//    public void setLoginSucheVornameMitNameAusDB(String loginSucheVornameMitNameAusDB) {
//        LoginSucheVornameMitNameAusDB = loginSucheVornameMitNameAusDB;
//    }
//----------------------------------------------------------------------------------------------------------------------

    public void schreibeDB(String einfuegString) {//String url, String user, String password,
        try (Connection connection = DriverManager.getConnection(getUrl1(), getUser1(), getPassword1())) {
            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
            Statement statement = connection.createStatement();
            statement.executeQuery(einfuegString);//query
            statement.close();
        } catch (SQLException ex) {
            System.out.println("ex ist gekommen");
            System.out.println(ex.getMessage());
        }
    }


    public void ausgabeNurEineSpalteDB(String ausgebeNurEineSpalteString) {
        try (Connection connection = DriverManager.getConnection(getUrl1(), getUser1(), getPassword1())) {
            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM userMubea");

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


    public void ausgebenGesamtDB(String ausgebeGesamtString) {
        try (Connection connection = DriverManager.getConnection(getUrl1(), getUser1(), getPassword1())) {
            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ausgebeGesamtString);

            int columns = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columns; i++) {
                System.out.print(String.format("%-15s", resultSet.getMetaData().getColumnName(i)));
            }
            System.out.println();
            System.out.print("-------------------------------------------------------");
            System.out.print("-------------------------------------------------------");
            System.out.print("-------------------------------------------------------");
            System.out.println();

            while (resultSet.next()) {
                for (int i = 1; i <= 1; i++) {
                    System.out.print(String.format("%-15s", resultSet.getString(i)));
                }
                for (int i = 2; i <= 2; i++) {
                    System.out.print(String.format("%-15s", resultSet.getString(i)));
                }
                for (int i = 3; i <= columns; i++) {
                    System.out.print(String.format("%-15s", resultSet.getString(i)));
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


    //    public String SucheVornameMitNameDB(String LoginSucheVornameMitNameAusDB){
//        String ausgabeGefundenerNameInDB = "";
//        try (Connection connection = DriverManager.getConnection(getUrl1(), getUser1(), getPassword1())) {
//            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM userMubea WHERE Vorname = '"+LoginSucheVornameMitNameAusDB+"'");
//
//            while (resultSet.next()) {
//                System.out.printf("Name?? %d: %s%n", resultSet.getInt(1),
//                        resultSet.getString(LoginSucheVornameMitNameAusDB));
//                ausgabeGefundenerNameInDB = resultSet.getString(LoginSucheVornameMitNameAusDB);
//            }
//            resultSet.close();
//            statement.close();
//
//        } catch (SQLException ex) {
//            System.out.println("Exception ist gekommen");
//            System.out.println(ex.getMessage());
//        }
//
//
//        return ausgabeGefundenerNameInDB;
//    }
    public String ausgebenGesamtDBRetourString(String ausgabeGesamtString2) {
        String gefundenUserInDB = "";
        try (Connection connection = DriverManager.getConnection(getUrl1(), getUser1(), getPassword1())) {
            System.out.println("Erfolgreich mit Datenbank verbunden :) ");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(ausgabeGesamtString2);

            int columns = resultSet.getMetaData().getColumnCount();
            for (int i = 1; i <= columns; i++) {
                System.out.print(String.format("%-15s", resultSet.getMetaData().getColumnName(i)));
            }
            System.out.println();
            System.out.print("-------------------------------------------------------");
            System.out.print("-------------------------------------------------------");
            System.out.print("-------------------------------------------------------");
            System.out.println();

            while (resultSet.next()) {

                for (int i = 1; i <= columns; i++) {
                    System.out.print(String.format("%-15s", resultSet.getString(i)));
                    gefundenUserInDB += resultSet.getString(i)+"/";
                }
                System.out.println();
                gefundenUserInDB = gefundenUserInDB+"///";
            }

            resultSet.close();
            statement.close();

        } catch (SQLException ex) {
            System.out.println("Exception ist gekommen");
            System.out.println(ex.getMessage());
        }

        return gefundenUserInDB;
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






