public class Anime {
    public String numberSeries;
    //public String Player;
    public String codeVideo;

    public String getNumberSeries() {
        return numberSeries;
    }

    public void setNumberSeries(String numberSeries) {
        this.numberSeries = numberSeries;
    }

    /*public String getPlayer() {
        return Player;
    }

    public void setPlayer(String player) {
        Player = player;
    }*/

    public String getCodeVideo() {
        return codeVideo;
    }

    public void setCodeVideo(String codeVideo) {
        this.codeVideo = codeVideo;
    }

    Anime()
    {

    }

    public Anime(String numberSeries, /*String Player,*/ String codeVideo)
    {
        this.numberSeries=numberSeries;
        //this.Player=Player;
        this.codeVideo=codeVideo;
    }


}
