public class Tugas4{

     public static void main(String []args){
        int param = 1;
        int hasil = Jumlahan(param);
        System.out.println("Angka penjumlahan " + param + " + 2 = " + hasil);
     }
     
     public static int Jumlahan(int x1) {
      int angka = x1;

      return angka + 2; 
   }
}