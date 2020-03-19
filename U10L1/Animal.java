public abstract class Animal {
    protected boolean wings = false;
    protected boolean legs = false;
    protected Animal(boolean wings, boolean legs) {
        this.wings = wings;
        this.legs = legs;
    }
    
    protected abstract void eat();
    protected abstract void hair();
    
    protected void sound() {
        System.out.println("Basic animal sound");
    }
}