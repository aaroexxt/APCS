import java.util.concurrent.*;

public class GameEngineTest {
    public static void main(String[] args) {
        /*
         * DEMO 1: AMERICAN FLAG
        */
        Rectangle background = new Rectangle();
        background.setFillChar('-');
        Square stars = new Square(0, 0, 5, true);
        stars.setFillChar('o');

        Rectangle flagPart1 = new Rectangle(0, 0, 20, 1, true);
        Rectangle flagPart2 = new Rectangle(0, 2, 20, 1, true);
        Rectangle flagPart3 = new Rectangle(0, 4, 20, 1, true);
        Rectangle flagPart4 = new Rectangle(0, 6, 20, 1, true);
        Rectangle flagPart5 = new Rectangle(0, 8, 20, 1, true);
        
        //Construct a GameEngine
        GameEngine americanFlag = new GameEngine(background, flagPart1, flagPart2, flagPart3, flagPart4, flagPart5, stars);
        americanFlag.setDisplaySize(50, 25);
        
        /*
         * DEMO 2: RECTANGLE SCROLLING
        */

        Rectangle rect = new Rectangle();
        GameEngine scrollTest = new GameEngine(rect);
        scrollTest.setDisplaySize(50,25);

        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
        Runnable renderer = new Runnable() {
            public void run() {
                scrollTest.clearTerminal();
                System.out.println(scrollTest.render());
                rect.setPosition(rect.getPosition().x, rect.getPosition().y+1);
            }
        };
        final ScheduledFuture<?> renderHandler = scheduler.scheduleAtFixedRate(renderer, 0, 50, TimeUnit.MILLISECONDS); //Delay 0, period 1 second
        Runnable renderStopper = new Runnable() {
            public void run() {
                renderHandler.cancel(true);
            }
        };
        scheduler.schedule(renderStopper, 500, TimeUnit.MILLISECONDS);


    }
}