package classe;

public class AreaCircTeste {
    public static void main(String[] args) {

        AreaCirc a1 = new AreaCirc(10);
        AreaCirc a2 = new AreaCirc(12);

//        AreaCirc.pi = 3.1415;

        System.out.println(AreaCirc.area(12));
        System.out.println(a1.area());
        System.out.println(a2.area());

    }
}
