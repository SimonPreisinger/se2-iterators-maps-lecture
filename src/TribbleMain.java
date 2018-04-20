import java.util.*;

public class TribbleMain {
    public static void main(String... args) {
        // Set<Tribble> tribbles = new TreeSet<>();
        List<Tribble> tribbles = new ArrayList<>();
        tribbles.add(new Tribble(1,100));
        tribbles.add(new Tribble(15,50));
        tribbles.add(new Tribble(15,100));
        System.out.println(tribbles);
        Collections.sort(tribbles); // hält sich an meine sort methode
        System.out.println(tribbles);

        List<Tribble> fixedTribbles = Collections.unmodifiableList(tribbles);
        System.out.println(fixedTribbles.size());
        fixedTribbles.remove(new Tribble(15,50)); // schützt nicht inhalt, aber Collectoin drum Fehler

    }


        /*
        List<Tribble> tlist = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            tlist.add(new Tribble(i, i));

        }
        for (int i = 0; i < 10; i++) {
            Tribble t = tlist.get(i);
            System.out.println(t);
        }

        Set<Tribble> tset = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            tset.add(new Tribble(i, i));
        }
        for (Iterator<Tribble> i = tset.iterator(); i.hasNext(); ) {
            Tribble t = i.next(); //next() = get + increment
            System.out.println(t);
        }
        for (Iterator<Tribble> i = tset.iterator(); i.hasNext(); ) {
            Tribble t = i.next(); //next() = get + increment
            // if(t.toString().contains("7"))
            //     tset.remove(t); // IteratorObject verändern während durchlauf nicht möglich
            // => CurrentModificatoinException, zum verarbeiten i.remove();
            if(t.toString().contains("7"))
                i.remove(); //schlecht ListIterator verwenden
            System.out.println(t);
        }

        for (Iterator<Tribble> i = tset.iterator(); i.hasNext(); ) {
            for (Iterator<Tribble> j = tset.iterator(); j.hasNext(); ) {
                Tribble t = j.next(); //next() = get + increment
                System.out.println(t);
            }
            Tribble t = i.next(); //next() = get + increment
            System.out.println(t);
        }
    }
    */
    //
    //Set<Tribble> tribbles = new HashSet<>();

    ////// tribbles.add(new Tribble(1,1));

    //long start = System.currentTimeMillis();
    //int tribbleCounter=0;
    //while (System.currentTimeMillis()-start<2_000){
    //    tribbles.add(new Tribble(tribbleCounter, tribbleCounter));
    //    tribbleCounter++;
    //}
    //System.out.println(tribbleCounter);
}

