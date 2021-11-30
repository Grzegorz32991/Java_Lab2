public class Main {

    public static void main(String[] args) {

        /* cw.4  */

        /* zad.1 napisać 3 pętle for i użyc:
        a) w pierwszej pętli break
        b) w drugiej pętli continue
        c) w trzeciej pętli return
        */
      for (int i = 0; i <= 100; i++) {
           if (i % 8 == 0)
               continue;
           System.out.print(i + " ");
       }

       for (int i = 0; i <= 125; i++) {
           if (i == 85)
              break;
           System.out.print(i + " ");
       }
        for (int i = 0; i <= 100; i++) {
            if (i == 33)
                return;
            System.out.print(i + " ");
        }

    }
}
