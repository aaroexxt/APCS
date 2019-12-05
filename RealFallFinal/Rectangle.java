public class Rectangle {
    //Basic parameters; height width and length as well as what character to fill with
    private int width;
    private int height;
    private char fillChar = '*';
    private boolean filled;

    //charTable and StringTable for rendering
    private char[][] charTableInternal;
    private String[] stringTableInternal;

    /*
    * CONSTRUCTORS
    */
    public Rectangle() {
        width = 40;
        height = 10;
        filled = true;

        //charTableInternal = new char[height][width]; //Not needed right now because of no collision detection
        //regenCharTable(); //Not needed right now because of no collision detection

        stringTableInternal = new String[height];
        regenStringTable();

        System.out.println(stringTableInternal[0]);
    }

    public Rectangle(int width, int height, boolean filled) {
        this.width = width*2; //because height is x2 in java, multiply width by 2
        this.height = height;
        this.filled = filled;

        //charTableInternal = new char[height][width]; //Not needed right now because of no collision detection
        //regenCharTable(); //Not needed right now because of no collision detection

        stringTableInternal = new String[height];
        regenStringTable();
    }

    /*
    * Getters/Setters
    */

    public int getWidth() {
        return width;
    }
    public void setWidth(int newWidth) {
        width = newWidth;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int newHeight) {
        height = newHeight;
    }

    public char getFillChar() {
        return fillChar;
    }
    public void setFillChar(char newChar) {
        fillChar = newChar;
    }

    public boolean getFilled() {
        return filled;
    }
    public void setFilled(boolean isFilled) {
        filled = isFilled;
    }

    /*
    * StringTable/CharTable implementation (mesh geometry)
    */

    public char[][] regenCharTable() {
        char[][] charTable = new char[height][width];
        for (int i=0; i<height; i++) {
            for (int j=0; j<width; j++) {
                if (filled) {
                    charTable[i][j] = fillChar;
                } else {
                    if ((i == 0 || i == height) && (j == 0 || j ==width)) {
                        charTable[i][j] = fillChar;
                    } else {
                        charTable[i][j] = ' '; //otherwise fill with space
                    }
                }
            }
        }
        charTableInternal = charTable; //set internal char table to what we just generated
        return charTable; //and return
    }

    public char[][] getCharTable() {
        return charTableInternal;
    }

    public String[] regenStringTable() {
        String[] stringTable = new String[height];
        for (int i=0; i<height; i++) {
            stringTable[i] = "";
            for (int j=0; j<width; j++) {
                if (filled) {
                    stringTable[i] += fillChar;
                } else {
                    if ((i == 0 || i == height) && (j == 0 || j == width)) {
                        stringTable[i] += fillChar;
                    } else {
                        stringTable[i] += " "; //otherwise fill with space
                    }
                }
            }
        }
        stringTableInternal = stringTable;
        return stringTable;
    }

    public String[] getStringTable() {
        return stringTableInternal;
    }
    
    /*
     * TOSTRING
     */
    public String toString() {
        return "Type: Rectangle, width: "+width+", height: "+height+", fillChar: "+fillChar+", isFilled: "+filled;
    }
}