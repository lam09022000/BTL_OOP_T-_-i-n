package MainJavaSwing.domain;

import java.util.ArrayList;
import java.util.List;

public class ManagerWord {

    private List<Dictionary> dictionaryArrayList = new ArrayList<>() ;

    public ManagerWord() {
    }

    public ManagerWord(List<Dictionary> dictionaryArrayList) {
        this.dictionaryArrayList = dictionaryArrayList;
    }

    public List<Dictionary> getDictionaryArrayList() {
        return dictionaryArrayList;
    }

    public void setDictionaryArrayList(List<Dictionary> dictionaryArrayList) {
        this.dictionaryArrayList = dictionaryArrayList;
    }

    public void addWord(Dictionary dictionary){
        // Thêm Từ mới ở đây
        System.out.println("Them tu moi");
    }

    public void deleteWord(Dictionary dictionary){
        //xoa mot tu ơ day
        System.out.println("xoa mot tu");
    }

    public void updateWord(){
        // Sửa một từ ở đây
        System.out.println("sua tu");
    }

    public List<Dictionary> getDictionaries(String s){
        //lấy ra từ điển ở đây
        System.out.println("Tim kiem tu theo chuoi truyen vao");
        return null ;
    }

}
