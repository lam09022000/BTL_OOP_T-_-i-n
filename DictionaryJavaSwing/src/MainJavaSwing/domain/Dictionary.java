package MainJavaSwing.domain;

public class Dictionary {

    private String mean_EN ;
    private String mean_VN ;

    private String sound_VN ;
    private String sound_EN ;



    public Dictionary(String mean_EN, String mean_VN) {
        this.mean_EN = mean_EN;
        this.mean_VN = mean_VN;
    }

    public String getMean_EN() {
        return mean_EN;
    }

    public void setMean_EN(String mean_EN) {
        this.mean_EN = mean_EN;
    }
}
