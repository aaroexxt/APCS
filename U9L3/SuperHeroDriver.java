
public class SuperHeroDriver {
    public static void main() {
        SuperHero heroes[] = new SuperHero[3];
        heroes[0] = new FriedEggMan();
        heroes[1] = new AsteroidMan();
        heroes[2] = new CSGod();
        
        System.out.println("Original set of ArrayList heroes:");
        for (SuperHero h: heroes) {
            System.out.println(h.getName()+";\t motto: "+h.motto()+", cape: "+h.isCaped()+", suitColor: "+h.getSuitColor());
        }
        
        System.out.println("\nPrinting 2d Array capedHeroes:");
        int xPos = 0;
        int yPos = 0;
        int heroCount = 0;
        int[] heroCapeIndices = new int[heroes.length];
        SuperHero capedHeroes[][] = new SuperHero[3][3];
        for (int i=0; i<heroes.length; i++) {
            if (heroes[i].isCaped()) {
                capedHeroes[yPos][xPos] = heroes[i];
                xPos++;
                heroCapeIndices[heroCount] = i;
                heroCount++;
                if (xPos > 2) {
                    yPos++;
                    xPos = 0;
                }
            }
        }
        for (SuperHero[] hOuter : capedHeroes) {
            for (SuperHero hInner : hOuter) {
                System.out.print(hInner+"\t");
            }
            System.out.println();
        }
        
        System.out.println("\nPrinting contents of capedHeroes:");
        xPos = 0;
        yPos = 0;
        for (int i=0; i<heroCount; i++) {
            SuperHero hero = capedHeroes[yPos][xPos];
            System.out.println(hero.getName()+";\t motto: "+hero.motto()+", cape: "+hero.isCaped()+", suitColor: "+hero.getSuitColor());
            xPos++;
            if (xPos > 2) {
                yPos++;
                xPos = 0;
            }
        }
        
        System.out.println("\nRemaining set of heroes:");
        boolean found = false;
        for (int i=0; i<heroes.length; i++) { //iterate thru heroes assuming that they go linearly
            found = false;
            for (int j=0; j<heroCapeIndices.length; j++) {
                if (heroCapeIndices[j] == i) {
                    found = true;
                }
            }
            if (!found) {
                SuperHero hero = heroes[i];
                System.out.println(hero.getName()+";\t motto: "+hero.motto()+", cape: "+hero.isCaped()+", suitColor: "+hero.getSuitColor());
            }
        }
    }
}