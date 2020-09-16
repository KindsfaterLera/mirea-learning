class Circle {

    private double R, D;

    public Circle(double R,double D){
        this.R = R;
        this.D = D;
    }

    public double getR() {
        return R;
    }

    public double setD() {
        return R*2;
    }

    public String ToString(){
        System.out.println("R = " + R + "; D = " + D);
    }
}
