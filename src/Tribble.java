public class Tribble implements Comparable<Tribble>{
    private final int size;

    private final int happiness;

    private static int nextNumber = 1;
    private final int number = nextNumber++;

    public Tribble(int size, int happiness) {
        this.size = size;
        this.happiness = happiness;
    }

    @Override
    public String toString() {
        return "Tribble {size "+ size + " happiness " + happiness + "}";
    }

    @Override
    public int hashCode(){
        int hash = 3;
        hash = 79 * hash + this.size;
        hash = 79 * hash + this.happiness;
        // bei string
        // hash = 79 * hash + string.hashCode();
        return  hash;

        //return 0;
    }

    @Override
    public int compareTo(Tribble other) {
        //equal und hashSet müssen auch angepasst werden sonst unterschiedliche
        // Ergebnisse
        if(number < other.number)
            return 1;
        if(number > other.number)
            return -1;
        return 0;
        /*
        System.out.printf(this + "Tribble{%s} compare.To other{%s}\n", size, other);
        if(size < other.size)
            return -238; // Zahl egal
        if(size > other.size)
            return 42; // Zahl egal

        // happiness auch vergleichen // man muss sich an equals halten: equals sollte gleiches Ergebnis haben
        if(happiness < other.happiness)
            return -1;
        if(happiness > other.happiness)
            return Integer.MAX_VALUE;

        return 0;
        */
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;
        if(obj == null) return false;
        if(getClass() != obj.getClass())
            return false;
        final Tribble other = (Tribble)obj;
        if(this.size != other.size)
            return false;
        if(this.happiness != other.happiness)
            return false;

       return true;
    }

}
