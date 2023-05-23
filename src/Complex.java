public class Complex {
    double real;
    double imaginary;
    Complex(){
    }
    Complex(double real, double imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    public void add(Complex c){
        this.real+=c.real;
        this.imaginary+=c.imaginary;
    }

    @Override
    public String toString() {
        return "Complex{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}

