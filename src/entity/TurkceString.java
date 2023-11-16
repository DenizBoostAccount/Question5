package entity;

public class TurkceString {
    public String ifade = "Hello World";
    public char karakterAl(int index){
        char ch = ifade.charAt(index);
        return ch;
    }
    public int indexBul(String karakter){
        int index = ifade.indexOf(karakter);
        return index;
    }
    public String altIfade(int baslangıc, int bitis){
        String altIfade = ifade.substring(baslangıc, bitis);
        return altIfade;
    }
}
