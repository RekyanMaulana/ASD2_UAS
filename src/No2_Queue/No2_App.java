package No2_Queue;
public class No2_App {
    public static void main(String[] args){
                No2 antrian = new No2(5);
                antrian.enqueue(24);
                antrian.display();
                antrian.enqueue(8);
                antrian.display();
                System.out.println("yang diambil dari antrian = "+ antrian.dequeue());
                System.out.println("Nama saya adalah R. Rekyan Maulana Setyawan");
                antrian.display();
                System.out.println("");
                antrian.enqueue(7);
                antrian.display();
                antrian.enqueue(6);
                antrian.display();
                System.out.println("nilai yang paling depan = "+ antrian.peek());
    }        
}
