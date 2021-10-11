package MainJavaSwing.domain;

import MainJavaSwing.DAO.UseDAO;

import java.util.ArrayList;
import java.util.List;

public class ManagerWord {
    private UseDAO useDAO = new UseDAO() ;

    private List<Word> wordList = new ArrayList<>() ;

    public ManagerWord() {
    }

    public ManagerWord(List<Word> dictionaryArrayList) {
        this.wordList = dictionaryArrayList;
    }

    public List<Word> getWordList() {
        return wordList;
    }

    public void setWordList(List<Word> wordList) {
        this.wordList = wordList;
    }

    public void addWord(Word newWord){
        // Thêm Từ mới ở đây
        if (newWord.getWordExplain() != "" && newWord.getWordTarget() != "") {
            useDAO.save(newWord);
            System.out.println("Them tu moi");
        } else {
            System.out.println("Them tu moi chua thanh cong");
        }
    }

    public void deleteWord(Word word){
        //xoa mot tu ơ day
        if (word.getWordExplain() != "" && word.getWordTarget() != "") {
            useDAO.delete(word);
        } else {
            System.out.println("Xoa tu chua thanh cong");
        }

    }

    public void updateWord(){
        // Sửa một từ ở đây
        System.out.println("sua tu");
    }

    public List<Word> getDictionaries(String s){
        //lấy ra từ điển ở đây
        if (s != "null") {
            useDAO.find(s) ;
        }
        System.out.println("Tim kiem tu theo chuoi truyen vao");
        return null ;
    }
    public void show() {
        if (wordList == null) {
            System.out.println("chua co tu tim kiem");
            return;
        }
        wordList.forEach(word -> word.show());
    }

}
