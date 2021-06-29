package Queue;
public class AntrianAPP {
    public static void main(String[] args) {
        Antrian.title();
        System.out.println("\n");
        Antrian antrian=new Antrian(10);
        antrian.enqueue(62);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("Nilai Yang Paling depan = "+antrian.peek());
        System.out.println("Nama Saya Adalah Rian Syaputra");
        System.out.println("\n");
        antrian.enqueue(70);
        antrian.display();
        System.out.println("Yang Diambil Dari antrian = "+ antrian.dequeue());
        antrian.display();
        System.out.println("Nilai Yang Paling Depan = "+antrian.peek());
    }
}
