public class HorizontalBar {
    
    private final int quantity;

    public HorizontalBar(int quantity) {
        this.quantity = quantity;
    }

    public boolean pass(CanPullUps canPullUps) {
        return canPullUps.getPullUps() >= quantity;
    }
}
