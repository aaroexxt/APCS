public class Doors {
    private String name;
    private boolean state;
    
    //Constructors
    public Doors() {
        name = "Front";
        state = true;
    }
    public Doors(String name, boolean state) {
        this.name = name;
        this.state = state;
    }
    
    //Setters
    public void setName(String newName) {
        this.name = newName;
    }
    public void open() {
        state = true;
    }
    public void close() {
        state = false;
    }
    
    //Getters
    public String getName() {
        return this.name;
    }
    public boolean getState() {
        return this.state;
    }
    
    //ToString
    public String toString() {
        return "Door name: "+name+" Door state: "+state;
    }
}
        