public class TestExceptionV3 {
    public static void main(String[] arg) {
  
      String[] listeNoms = new String[1];
  
      listeNoms[0] = "A";
      try {
        listeNoms[1] = "B";
      } catch (Exception e) {
        System.out.println("exception émise : " + e);
      } finally {
        System.out.println("toujours fait");
      }
      System.out.println("fin du main");
    }
  }