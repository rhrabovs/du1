import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Prodejce prodejce1 = new Prodejce();
        Prodejce prodejce2 = new Prodejce();

        prodejce1.setJmeno("Zelenina JUVITA");
        prodejce1.setDatumNarozeni(LocalDate.of(1970,1,1)) ;
        prodejce1.setSjednaneSmlouvy(1000);
        prodejce1.setProdaneMnozstvi(1500.75);
        prodejce1.setSenior(true);

        prodejce2.setJmeno("ZANE Otaslavice");
        prodejce2.setDatumNarozeni(LocalDate.of(2000,1,1));
        prodejce2.setSjednaneSmlouvy(990);
        prodejce2.setProdaneMnozstvi(999.98);
        prodejce2.setSenior(false);

        System.out.println("\np r o d e j c i   m r k v e");
        System.out.println("---------------------------\n\n");

        System.out.println(prodejce1.getJmeno()+", zalozeno: "+prodejce1.getDatumNarozeni());
        System.out.println("za dobu existence vyprodukoval "+prodejce1.getProdaneMnozstvi()+"t mrkve\n");

        System.out.println(prodejce2.getJmeno()+", zalozeno: "+prodejce2.getDatumNarozeni());
        System.out.println("za dobu existence vyprodukoval "+prodejce2.getProdaneMnozstvi()+"t mrkve");

    }
}
