package Stack;
public class TumpukanAPP {
        public static void main(String[] args) {
    Tumpukan.title();
    System.out.println("\n");
    Tumpukan tumpukan = new Tumpukan(10);
    tumpukan.push(62);
    tumpukan.baca();
    tumpukan.push(30);
    tumpukan.baca();
    long nilai1=tumpukan.pop();
    System.out.println("Nilai Teratas = "+nilai1);
    System.out.println("Nama Saya Adalah Rian Syaputra");
    System.out.println("Nilai Yang Dihapus"+nilai1);
    System.out.println("\n");
    tumpukan.baca();
    tumpukan.push(40);
    tumpukan.baca();
    tumpukan.push(50);
    tumpukan.baca();
    }
}
