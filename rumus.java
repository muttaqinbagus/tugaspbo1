public class rumus {
    //properti
    private float celcius, reamur,hasilreamur,fahrenheit,hasilfahrenheit;  
    
    // method
    public void hitung(float reamur , float fahrenheit){
        this.reamur = reamur;
        this.fahrenheit = fahrenheit;

        hasilreamur = reamur/0.8f;     
        hasilfahrenheit =(fahrenheit-32)/1.8f;

        System.out.println();
        System.out.print("Nilai Suhu Reamur ke Celcius : ");
        System.out.println(hasilreamur);

        System.out.print("Nilai Suhu fahrenheit ke Celcius : ");
        System.out.println(hasilfahrenheit);
    } 
}
