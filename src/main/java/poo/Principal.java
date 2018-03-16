package poo;

public class Principal {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(14,15);
        System.out.println(ret.desenharASCII());
        System.out.println();
        System.out.println(ret.desenharUTF8());
    }
}
