public abstract class TV {
    private boolean tvON;
    public boolean getTVOn() {
        return tvON;
    }
    public void setTVOn(boolean tO) {
        tvON = tO;
    }
    
    public abstract String tvType();
}