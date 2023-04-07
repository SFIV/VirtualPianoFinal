package com.example.virtualpiano;
import java.sql.*;

public class SQL {

    private static String username="ivan";
    private static String password="123";
    public static String EncryptDecrypt(String inp)
    {
        String key = "HUNDRED";
        StringBuilder ret = new StringBuilder();
        for(int i = 0 ; i < inp.length() ; i++)
        {
            ret.append((char) (inp.charAt(i) ^ key.charAt(i % key.length())));
        }
        return ret.toString();
    }
    public static boolean CheckUsernameAvailability(String UsernameToCheck)
    {

        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery = "select * from VirtualPiano where username = ?";
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);

            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setString(1, UsernameToCheck);
            ResultSet rs = pStmt.executeQuery();



            boolean ret = !rs.next();
            // step4 drop all the connections
            con.close();
            pStmt.close();
            rs.close();
            return ret;
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return false;
    }
    public static void addUser(String UsernameToAdd, String PasswordToAdd)
    {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery = "insert into virtualpiano values (?, ?, ?, ?, ?)";
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);

            // step3 create the statement object
            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            String encryptedPassword = EncryptDecrypt(PasswordToAdd);
            pStmt.setString(1, UsernameToAdd);
            pStmt.setString(2, encryptedPassword);
            // setting the login date as day before and streak as 0 initially to avoid extra case handeling
            pStmt.setDate(3, Date.valueOf(java.time.LocalDate.now().minusDays(1)));
            pStmt.setInt(4, 0);
            pStmt.setInt(5, 0);
            pStmt.executeUpdate();

            // saving the seettings
            mySettings.revertKeysToDefault();
            sqlQuery = "insert into Piano_SETTINGS values(?, ?, ?)";
            pStmt = con.prepareStatement(sqlQuery);
            for(int i = 1 ; i <= 61 ; i++)
            {
                pStmt.setString(1, UsernameToAdd);
                pStmt.setInt(2, i);
                pStmt.setInt(3, mySettings.buttonToCode[i]);
                pStmt.executeUpdate();
            }


            // step4 drop all the connections
            con.close();
            pStmt.close();
//            rs.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public static boolean checkPassword(String usernameToCheck, String passwordGiven)
    {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery = "select * from virtualpiano where username = ?";
        String acquiredPass = new String();
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);

            // step3 create the statement object
            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setString(1, usernameToCheck);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
                acquiredPass = rs.getString(2);
            // step4 drop all the connections
            con.close();
            pStmt.close();
            rs.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            throw new RuntimeException(e);
        }
        acquiredPass = EncryptDecrypt(acquiredPass);
        return passwordGiven.equals(acquiredPass);
    }
    public static void loadKeybinds(String User)
    {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery;
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);

            sqlQuery = "select * from piano_settings where username = ?";

            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setString(1, User);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {
                int buttonSaved = rs.getInt(2);
                int codeSaved = rs.getInt(3);
                mySettings.buttonToCode[buttonSaved] = codeSaved;
                mySettings.codeToButton[codeSaved] = buttonSaved;
            }

            // step4 drop all the connections
            con.close();
            pStmt.close();
            rs.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
    }
    public static void saveKeybinds(String User)
    {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery;
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);


            // step3 create the statement object
            sqlQuery = "delete from Piano_SETTINGS where username = ?";
            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setString(1, User);
            pStmt.executeUpdate();
            sqlQuery = "insert into Piano_SETTINGS values(?, ?, ?)";
            pStmt = con.prepareStatement(sqlQuery);
            for(int i = 1 ; i <= 61 ; i++)
            {
                pStmt.setString(1, User);
                pStmt.setInt(2, i);
                pStmt.setInt(3, mySettings.buttonToCode[i]);
                pStmt.executeUpdate();
            }

            // step4 drop all the connections
            con.close();
            pStmt.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
    }
    public static void loadSettings(String User)
    {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery;
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);

            sqlQuery = "select * from virtualpiano where username = ?";

            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setString(1, User);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {
                mySettings.darkMode = rs.getInt(5);
                mySettings.lastLog = rs.getDate(3);
                mySettings.streak = rs.getInt(4);
                if(Date.valueOf(java.time.LocalDate.now().minusDays(1)) == mySettings.lastLog)
                {
                    mySettings.streak++;
                }
                else if(mySettings.streak == 0)
                {
                    mySettings.streak++;
                }
            }

            // step4 drop all the connections
            con.close();
            pStmt.close();
            rs.close();
            loadKeybinds(User);
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
    }
    public static void saveSettings(String User)
    {
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery = new String();
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);

            sqlQuery = "update virtualpiano set lastlogin = ?, streak = ?, darkmode = ?, password = ? where username = ?";

            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setDate(1, Date.valueOf(java.time.LocalDate.now()));
            pStmt.setInt(2, mySettings.streak);
            pStmt.setInt(3, mySettings.darkMode);
            pStmt.setString(4, EncryptDecrypt(mySettings.Password));
            pStmt.setString(5, User);
            pStmt.executeUpdate();

            // step4 drop all the connections
            con.close();
            pStmt.close();
            saveKeybinds(User);
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
    }
    public static void saveMessage(String User,String Message)
    {
        String username = "md6p2m5o4ygwugvrj6ld";
        String password = "pscale_pw_OAxV1OfOG8m2Efg1530h21S0XZp8SNAhEJsgci4GFO3";
        String url = "jdbc:mysql://aws.connect.psdb.cloud/messages?sslMode=VERIFY_IDENTITY";
        String sqlQuery = new String();
        try{
            // step1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://aws.connect.psdb.cloud/messages?sslMode=VERIFY_IDENTITY",
                    "md6p2m5o4ygwugvrj6ld",
                    "pscale_pw_OAxV1OfOG8m2Efg1530h21S0XZp8SNAhEJsgci4GFO3");


            sqlQuery = "insert into messages(username,text) values(?,?)";


            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setString(1,User);
            pStmt.setString(2,Message);
            pStmt.executeUpdate();

            // step4 drop all the connections
            con.close();
            pStmt.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
    }

    public static String getMessage()
    {
        String[] arr = new String[50];
        String finalMessage = new String();
        int index=0;
        String usernameMYSQL = "md6p2m5o4ygwugvrj6ld";
        String passwordMYSQL = "pscale_pw_OAxV1OfOG8m2Efg1530h21S0XZp8SNAhEJsgci4GFO3";
        String url = "jdbc:mysql://aws.connect.psdb.cloud/messages?sslMode=VERIFY_IDENTITY";
        String sqlQuery = new String();
        try{
            // step1 load the driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://aws.connect.psdb.cloud/messages?sslMode=VERIFY_IDENTITY",
                    "md6p2m5o4ygwugvrj6ld",
                    "pscale_pw_OAxV1OfOG8m2Efg1530h21S0XZp8SNAhEJsgci4GFO3");
            sqlQuery = "select * from messages order by sent desc";


            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {
                if(index==45)
                {
                    break;
                }
                arr[index] = rs.getString(1) +": "+rs.getString(2);
                index++;
            }
            for(int i=index-1;i>=0;i--)
            {
                finalMessage += arr[i];
                finalMessage+="\n";
            }

            // step4 drop all the connections
            con.close();
            pStmt.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }

        return finalMessage;
    }

    public static String getGameSequence(int ID)
    {
        String sequence = new String();
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery = new String();
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);
            sqlQuery = "select * from game where id = ?";


            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setInt(1,ID);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {
                sequence = rs.getString(2);
            }

            // step4 drop all the connections
            con.close();
            pStmt.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }

        return sequence;
    }
    public static String getAllGames()
    {
        String sequence = new String();
        int idObtained;
        String GameName = new String();
        String ret = new String();
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery = new String();
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);
            sqlQuery = "select * from game";


            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {
                idObtained = rs.getInt(1);
                sequence = rs.getString(2);
                GameName = rs.getString(3);
                ret += String.valueOf(idObtained) + ". " + GameName + "\n";
            }

            // step4 drop all the connections
            con.close();
            pStmt.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
        return ret;
    }

    public static int insertScore(int id,int score)
    {
        int scoreObtained=0;
        System.out.println(score);
        boolean flag=false;
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery = new String();
        String sqlQuery2 = new String();
        String sqlQuery3 = new String();
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);
            sqlQuery = "select * from scores where game_id =? and username = ?";
            sqlQuery2 = "insert into scores values(?,?,?)";
            sqlQuery3 = "update scores set score = ? where game_id = ? and username = ?";


            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            PreparedStatement pStmt2= con.prepareStatement(sqlQuery2);
            PreparedStatement pStmt3 = con.prepareStatement(sqlQuery3);
            pStmt.setInt(1,id);
            pStmt.setString(2,mySettings.Username);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {
                flag = true;
                scoreObtained=rs.getInt(2);
            }

            if(flag)
            {
                pStmt3.setInt(1,Integer.max(score,scoreObtained));
                pStmt3.setInt(2,id);
                pStmt3.setString(3,mySettings.Username);
                pStmt3.executeUpdate();
            }
            else
            {
                pStmt2.setInt(1,id);
                pStmt2.setInt(2,score);
                pStmt2.setString(3,mySettings.Username);
                pStmt2.executeQuery();
            }

            // step4 drop all the connections
            con.close();
            pStmt.close();
            pStmt2.close();
            pStmt3.close();
        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
        return Integer.max(score,scoreObtained);
    }

    public static String getGlobalMax(int id)
    {
        int scoreObtained=0;
        String nameObtained="";
        boolean flag=false;
        String ret = "";
        String url = "jdbc:oracle:thin:@localhost:1521:xe";
        String sqlQuery = new String();
        try{
            // step1 load the driver class
            Class.forName("oracle.jdbc.driver.OracleDriver");

            // step2 create the connection object
            Connection con = DriverManager.getConnection(url, username, password);
            sqlQuery = "select * from scores where game_id =?";


            // step3 create the statement object

            PreparedStatement pStmt = con.prepareStatement(sqlQuery);
            pStmt.setInt(1,id);
            ResultSet rs = pStmt.executeQuery();
            while(rs.next())
            {
                flag = true;
                scoreObtained=rs.getInt(2);
                nameObtained = rs.getString(3);
            }

            if(flag)
            {
                ret += scoreObtained+" ("+nameObtained+")";
            }
            else
            {
                ret = "--";
            }


            // step4 drop all the connections
            con.close();
            pStmt.close();

        } catch (SQLException e)
        {
            System.out.println(" Error while connecting to database. Exception code : " + e);
        } catch (ClassNotFoundException e)
        {
            System.out.println(" Failed to register driver . Exception code : " + e );
        }
        return ret;
    }
}
