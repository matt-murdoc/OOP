public class Potion {
    
    private int volume;
    private String effect;

    Potion () {

        volume = 100;
        effect = "Neutral";
    }
    
    Potion (int volume, String effect) {

        this.volume = volume;
        this.effect = effect;
    }

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getEffect() {
        return this.effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }


}
