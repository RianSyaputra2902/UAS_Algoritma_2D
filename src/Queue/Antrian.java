package Queue;
public class Antrian {
    private int ukuran;
    private long[] antrian;
    private int belakang;
    private int jumlahItem;
    private int depan;
    
    public Antrian(int Data){
        ukuran = Data;
        antrian = new long[ukuran];
        depan = 0;
        belakang = -1;
        jumlahItem = 0;
    }
    public void enqueue(long m){
        if (!isFull()){
            antrian[++belakang]=m;
            jumlahItem++;
        }
    }
    public long dequeue(){
        long temp=antrian[0];
        if (!isEmpety()){
            for (int i=0; i<jumlahItem; i++)
                antrian[i]=antrian[i+1];
                jumlahItem--;
                belakang--;
        }
        return temp;
    }
    public long peek(){
        return antrian[depan];
    }
    public boolean isEmpety(){
        return (jumlahItem==0);
    }
    public boolean isFull(){
        return(belakang==ukuran-1);
    }
    public int ukuran(){
        return jumlahItem;
    }
    public void display(){
        for (int i=0; i<jumlahItem; i++)
        System.out.print(antrian[i]+" ");
        System.out.println(" ");
    }
    public static void title() {
        String myHeader;
        myHeader = "---------------------------------"+
                "\nAlgoritma dan Struktur Data 2\n"+
                "----------------------------------";
        String Name = "Rian Syaputra";
        int Nim = 20090062;
        
        String modul;
        modul = "---------------------------------"+
                "\nPraktikum Modul 7 Antrian\n"+
                "---------------------------------";
        
        System.out.println(myHeader);
        System.out.println("\nNama : "+ Name + "\nNim : "+Nim+"\n");
        System.out.println(modul);
    }
}
