import java.util.Scanner;
public class himp{
       Scanner input = new Scanner(System.in);
       int[] Array1= new int[100];
       int[] Array2= new int[100];
       int JumlahArray1;
       int JumlahArray2;
       public void dataAnggota() {
           System.out.print("Masukkan Jumlah Array 1 : ");
              JumlahArray1 = input.nextInt();
              System.out.println("Anggota Array 1");
              for(int i=1;i<=JumlahArray1;i++){
                      System.out.print("Anggota "+i+" : ");
                      Array1[i]=input.nextInt();
              }
              System.out.print("Masukkan Jumlah Array 2 : ");
              JumlahArray2 = input.nextInt();
              System.out.println("Anggota Array 2");
               for(int i=1;i<=JumlahArray2;i++){
                      System.out.print("Anggota "+i+" : ");
                      Array2[i]=input.nextInt();
              }
       }
       public void tampilAnggota(){
              System.out.print("Anggota Array 1 = { ");
              for(int i=1;i<=JumlahArray1;i++){
                System.out.print(Array1[i]+"   ");
              }
              System.out.println("}");
              System.out.print("Anggota Array 2 = { ");
              for(int i=1;i<=JumlahArray2;i++){
                System.out.print(Array2[i]+ "  ");
              }
              System.out.println("}");
       }
       public void himpunanIrisan(){
         System.out.print("Himpunan Irisan Array 1 dan 2 : { ");
           for( int i=1;i<=JumlahArray2;i++){
                   boolean adaSama = false;
                   for(int j=1;j<=JumlahArray1;j++){
                     if(Array2[i]==Array1[j])
                            adaSama=true;
              }
              if(adaSama==true){
                 System.out.print(Array2[i]+" ");
              }
              }
              System.out.println(" }");
       }
       public static void main(String args[]){
              himp bilangan = new himp();
              bilangan.dataAnggota();
              bilangan.tampilAnggota();
              bilangan.himpunanIrisan();
       }
}
