import java.util.*;

public class TribbleMain {
    public static void main(String... args) {
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

