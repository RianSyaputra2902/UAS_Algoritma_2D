package Stack;
public class Tumpukan {
    public int ukuran;
        public long[] tumpukan;
        public int top;
        
public Tumpukan(int nilai){
    ukuran=nilai;
    tumpukan=new long[ukuran];
    top=-1;
}        
public void push(long j){
    tumpukan[++top]=j;
}
public long pop(){
    return tumpukan[top--];
}
public long peek(){
    return tumpukan[top];
}
public boolean isEmpty(){
    return(top == ukuran-1);
}
public boolean isFull(){
    return(top==ukuran-1);
}
public void baca(){
    int i = top;
    while(i>=0){
        System.out.print(tumpukan [i] + " ");
        System.out.print(" ");
        i--;
    }
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
                "\nModul 6 stack\n"+
                "---------------------------------";
        
        System.out.println(myHeader);
        System.out.println("\nNama : "+ Name + "\nNim : "+Nim+"\n");
        System.out.println(modul);
    }
}
