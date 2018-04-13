public class Tribble {
    private final int size;
    private final int happiness;

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
    public boolean equals(Object obj) {
        // ...

       // if(this.size != other.size)
       //     return false;
       // if(this.happiness != other.happiness)
       //     return false;
       return true;
    }

}
