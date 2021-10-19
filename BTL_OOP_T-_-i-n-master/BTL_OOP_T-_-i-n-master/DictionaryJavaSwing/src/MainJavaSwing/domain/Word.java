package MainJavaSwing.domain;

public class Word {

    private String wordTarget ;
    private String wordSpelling ;
    private String wordExplain;

    private String sound_VN ;
    private String sound_EN ;


    public Word(String wordTarget, String wordSpelling, String wordExplain , String sound_EN) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
        this.wordSpelling = wordSpelling ;
        this.sound_EN = sound_EN ;
    }

    public Word(String wordTarget, String wordSpelling, String wordExplain) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
        this.wordSpelling = wordSpelling ;
    }
    public Word(String wordTarget, String wordExplain ) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
        this.wordSpelling = "wordSpelling" ;
    }

    public String getWordTarget() {
        return wordTarget;
    }

    public void setWordTarget(String wordTarget) {
        this.wordTarget = wordTarget;
    }

    public String getWordExplain() {
        return wordExplain;
    }

    public void setWordExplain(String wordExplain) {
        this.wordExplain = wordExplain;
    }

    public void show() {
        System.out.println("|" + this.wordTarget + "\t" + "|"+this.wordExplain);
    }

    public String getWordSpelling() {
        return wordSpelling;
    }

    public void setWordSpelling(String wordSpelling) {
        this.wordSpelling = wordSpelling;
    }

    public String getSound_EN() {
        return sound_EN;
    }

    public void setSound_EN(String sound_EN) {
        this.sound_EN = sound_EN;
    }
}
