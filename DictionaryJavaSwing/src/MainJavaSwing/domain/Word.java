package MainJavaSwing.domain;

public class Word {

    private String wordTarget ;
    private String wordExplain;

    private String sound_VN ;
    private String sound_EN ;



    public Word(String wordTarget, String wordExplain) {
        this.wordTarget = wordTarget;
        this.wordExplain = wordExplain;
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
}
