package entity;

public class Test {
    public static void main(String[] args) {
        TurkceString turkce1 = new TurkceString();
        System.out.println(turkce1.karakterAl(3));
        System.out.println(turkce1.indexBul("H"));
        System.out.println(turkce1.altIfade(0,6));
    }
}
