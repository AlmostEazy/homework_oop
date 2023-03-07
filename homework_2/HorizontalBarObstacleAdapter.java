public class HorizontalBarObstacleAdapter implements Obstacle{
    
    private final HorizontalBar horizontalBar;

    public HorizontalBarObstacleAdapter(HorizontalBar horizontalBar) {
        this.horizontalBar = horizontalBar;
    }

    @Override
    public boolean pass(Participant participant) {
        return horizontalBar.pass(participant);
    }
}
