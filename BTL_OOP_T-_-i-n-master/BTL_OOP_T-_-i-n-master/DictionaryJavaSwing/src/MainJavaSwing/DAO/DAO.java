package MainJavaSwing.DAO;

import MainJavaSwing.domain.Word;

import java.util.List;

public interface DAO {
    List<Word> getAll() ;

    void save(Word word) ;
    void update(Word word,Word newWord) ;
    void delete(Word word) ;
    List<Word> find(String s) ;

}
