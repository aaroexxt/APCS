public class GameEngineTest {
    public static void main(String[] args) {
        //Construct some shapes
        Rectangle rec1 = new Rectangle();
        Square squ1 = new Square();
        
        //Construct a GameEngine
        GameEngine renderTest = new GameEngine(rec1, squ1);
        System.out.println(renderTest);
        
        System.out.println("ShapeStringTable: ");
        for (String s : renderTest.getShapeStringTable(0)) {
            System.out.println(s);
        }
    }
}