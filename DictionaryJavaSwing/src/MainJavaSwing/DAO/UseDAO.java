package MainJavaSwing.DAO;

import MainJavaSwing.domain.Word;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UseDAO implements DAO {

    @Override
    public List<Word> getAll() {
        try {
            Connection conn = ConnectToDatabase.getConnection();
            List<Word> list = new ArrayList<>();
//         crate statement

            Statement stmt = conn.createStatement();
            // get data from table 'student'
            ResultSet rs = stmt.executeQuery("select * from word");// show data
            while (rs.next()) {
                Word word = new Word(rs.getString(1), rs.getString(2)) ;
                list.add(word) ;
                word.show();
            }
            // close connection
            conn.close();
            rs.close();
            stmt.close();
            return  list ;
        } catch (Exception e) {
            e.printStackTrace();
            return  null ;
        }

    }

    @Override
    public void save(Word word) {
        try {
            Connection conn = ConnectToDatabase.getConnection();
//         crate statement

//            Statement stmt = conn.createStatement();
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String sql = "INSERT INTO anh_viet (word,spelling,detail) VALUES ('"+ word.getWordTarget()+ "','"+ word.getWordSpelling()+ "','"+ word.getWordExplain()+"');" ;

            stmt.executeUpdate(sql);//
            System.out.println("Insert complete");
            // close connection
            conn.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public void update(Word word, Word newWord) {
        try {
            Connection conn = ConnectToDatabase.getConnection();
//         crate statement

//            Statement stmt = conn.createStatement();
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String sql = "UPDATE anh_viet " +
                        "SET word = '"+newWord.getWordTarget()+"', spelling= '"+newWord.getWordSpelling()+"', detail= '"+newWord.getWordExplain()+"' " +
                        "WHERE word = '"+word.getWordTarget()+"';" ;

            stmt.executeUpdate(sql);// show data
            System.out.println("Update complete");
            // close connection
            conn.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    @Override
    public void delete(Word word) {
        try {
            Connection conn = ConnectToDatabase.getConnection();
//         crate statement

//            Statement stmt = conn.createStatement();
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String sql = "DELETE FROM anh_viet WHERE word = '" +word.getWordTarget() +"';" ;

            stmt.execute(sql);// show data
            System.out.println("DELETE complete");
            // close connection
            conn.close();
            stmt.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Override
    public List<Word> find(String s) {
        try {
            List<Word> list = new ArrayList<>() ;
            Connection conn = ConnectToDatabase.getConnection();
//         crate statement

//            Statement stmt = conn.createStatement();
            Statement stmt = conn.createStatement();
            // get data from table 'student'
            String sql = "SELECT * FROM anh_viet WHERE word like '" + s +"%';" ;

            ResultSet rs = stmt.executeQuery(sql);// show data
            while (rs.next()) {
                Word word = new Word(rs.getString(2), rs.getString(3),rs.getString(4)) ;
                list.add(word) ;
                word.show();
            }
            System.out.println("FIND complete");
            // close connection
            conn.close();
            stmt.close();

            return list ;

        } catch (Exception e) {
            e.printStackTrace();
            return null ;
        }
    }
}
