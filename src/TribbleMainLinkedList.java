import java.util.*;

public class TribbleMainLinkedList {
    public static void main(String... args) {
        LinkedList<Integer> ll = new LinkedList<>(); // schnell 36 ms
        //List<Integer> ll = new ArrayList<>(); // viel langsamer 25073 ms
        for(int i = 0; i < 1_000_000; i++){
            ll.add(i);
        }

        long start = System.currentTimeMillis();
        for(ListIterator<Integer> i = ll.listIterator(); i.hasNext();){
            int element = i.next();
            if(element%2 == 0){
                i.remove();
            }
        }

        for(int i:ll)
            System.out.println(i);

        for(Iterator<Integer> i = ll.iterator(); i.hasNext();){ // gleich wie  for(int i:ll) in Zeile 19
            int x = i.next();
            System.out.println(x);
        }
        System.out.println(System.currentTimeMillis() - start );
    }
}

