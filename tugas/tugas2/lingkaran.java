package tugas2;

public class lingkaran {
    double phi = 3.14;
    double r;

    public lingkaran (double r){
        this.r = r;
    }

    public double Luas (){
        return phi * r * r;
    }

    public double keliling (){
        return 2 * phi * r;
    }

}
