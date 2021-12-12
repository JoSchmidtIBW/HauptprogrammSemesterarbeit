package com.example.login;

/**
 * @author - John Schmidt
 * 25.11.2021, 21:21
 */
public class YoutubeMain {
    public static void main(String[] args) {

        DBMethodenKlasse dbk1 = new DBMethodenKlasse();

        String url1 = "jdbc:mariadb://localhost:3306/databaseliste";//name von "database liste"
        String user1 = "root";
        String password1 = "Mubea2020!";

        String einfuegString1 = "INSERT INTO listlaender" +
                "(landgeo, officialname, capitalcity, largestcity, areakm, population, callingcode, iso, waehrung)" +
                "VALUES  ('Malrrrta', 'VWWW', 'Irgend', 'jijin', '81', '8857', '+4dd3', 'AfffffT', 'Eo');";

        dbk1.schreibeDB(url1,user1,password1, einfuegString1);      //Immer wenn Play, kommt natürlich wieder eine dazu

        String ausgabeGesamtString = "SELECT * FROM listlaender";
        dbk1.ausgebenGesamtDB(url1,user1,password1, ausgabeGesamtString);

       // String ausgabeNurEineSpalte = "largestcity";
        //dbk1.ausgabeNurEineSpalteDB(url1,user1,password1,ausgabeNurEineSpalte);




        //HelloApplication.launch(); geht nicht weil nicht fx klasse,
        // desshalb das main in helloapplication
    }
}

//----------------------------------------------------------------------------------------------------------------------
//        YoutubeDB dbyt1 = new YoutubeDB();
//
//        String url = "jdbc:mariadb://localhost:3306/databaseliste";//name von database liste
//        String user = "root";
//        String password = "Mubea2020!";
//
//        String einfügString = "INSERT INTO listlaender" +
//                "(landgeo, officialname, capitalcity, largestcity, areakm, population, callingcode, iso, waehrung)" +
//                "VALUES  ('Malta', 'VWWW', 'Irgend', 'jijin', '81', '8857', '+4dd3', 'AfffffT', 'Eo');";
//
//        String columnofficialname = "officialname";
//
//        dbyt1.zugriffDB(url,user,password,einfügString);
//
//
//        System.out.println("Hello kitty");

//----------------------------------------------------------------------------------------------------------------------