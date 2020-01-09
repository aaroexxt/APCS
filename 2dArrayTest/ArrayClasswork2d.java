public class ArrayClasswork2d {
    public static void main(String[] args) {
        String[][] favoriteArtists = {
            {"Aaron","TA1", "TB1"},
            {"Abigail", "TA2", "TB2"},
            {"Rachel", "TA3", "TB3"},
            {"Shawn", "TA4", "TB4"}
        };
        
        System.out.println("Becker-Perkel family favorite artists");
        for (int i=0; i<favoriteArtists.length; i++) {
            for (int j=0; j<favoriteArtists[i].length; j++) {
                if (j == 0) {
                    System.out.println("\nName: "+favoriteArtists[i][j]);
                } else {
                    System.out.print("Artist: "+favoriteArtists[i][j]+" ");
                }
            }
        }
    }
}