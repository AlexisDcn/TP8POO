public class TestExceptionV2 {
    public static void main(String[] arg) {

        String[] listeNoms = new String[2]; // tableau à la bonne taille

        listeNoms[0] = "A";
        try {
            listeNoms[1] = "B";
        } catch (Exception e) {
            System.out.println("exception émise : " + e);
        }
        System.out.println("fin du main");
    }
}