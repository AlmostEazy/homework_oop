public abstract class BaseParticipant implements Participant {

    private final String name;
    private final int jump;
    private final int run;
    private final int swim;
    private final int pullup;

    public BaseParticipant(String name, int jump, int run, int swim, int pullup) {
        this.name = name;
        this.jump = jump;
        this.run = run;
        this.swim = swim;
        this.pullup = pullup;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getJump() {
        return jump;
    }

    @Override
    public int getRun() {
        return run;
    }

    @Override
    public int getSwim() {
        return swim;
    }

    @Override
    public int getPullUps() {
        return pullup;
    }
}
