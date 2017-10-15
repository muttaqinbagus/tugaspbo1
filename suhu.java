import java.util.Scanner;
public class suhu {
    
    public static void main (String[] args){
    float reamur , fahrenheit;    
    Scanner masukan = new Scanner(System.in);

    rumus obj = new rumus();
    
    System.out.println("===========NAMA===========");
    System.out.println("MUTTAQIN BAGUS SEPTIAJI");
    System.out.println("06.2016.1.06709");
    System.out.println("===========================");
    System.out.print("Masukan nilai suhu (reamur) : ");
    reamur = masukan.nextFloat();
    System.out.print("Masukkan nilai suhu (fahrenheit) : ");
    fahrenheit = masukan.nextFloat();
  
    obj.hitung(reamur, fahrenheit);
    }
    
}
