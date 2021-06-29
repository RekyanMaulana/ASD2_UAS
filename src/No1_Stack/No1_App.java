package No1_Stack;
public class No1_App {
    public static void main (String[] args){
        No1 tumpukan = new No1(5);
        tumpukan.push(24);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(2);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(3);
        tumpukan.baca();
        System.out.println(" ");
        long nilai1 = tumpukan.peek();
        System.out.println("nilai teratas = "+ nilai1);
        System.out.println("Nama saya adalah R. Rekyan Maulana Setyawan");
        long nilai0 = tumpukan.pop();
        System.out.println("nilai yang dihapus = "+ nilai0);
        tumpukan.baca();
        System.out.println(" ");
        System.out.println(" ");
        tumpukan.push(4);
        tumpukan.baca();
        System.out.println(" ");
    }    
}
