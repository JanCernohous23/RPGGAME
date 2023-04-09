package rpgamev001;

public class Player extends Person {

    private float sellability;
    public Player() {
        super();
    }
//sellability
    public float getSellability() {
        return sellability;
    }
    public void setSellability(float sellability) {
        this.sellability = sellability;
    }
    
}
