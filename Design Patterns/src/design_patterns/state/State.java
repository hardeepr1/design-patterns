package design_patterns.state;

public abstract class State {

    Player player;

    State(Player player){
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPLay();
    public abstract String onNext();
    public abstract String onPrevious();
}
