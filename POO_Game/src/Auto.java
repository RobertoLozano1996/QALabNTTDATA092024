public class Auto {
    private String sPlaca;
    private  double dVelocidadMaxima = 180;
    private boolean bEncendidoMotor = false;
    private boolean bMovimiento = false;
    private boolean bLucesEncendidas = false;
    private double dDistanciaFrenado = 8;
    private double dVelocidadActual = 0;
    private double dAceleracion = 15;
    private double dTemperatura;

    public Auto(String sPlaca) {
        this.sPlaca = sPlaca;
    }

    public void encenderMotor(){
        System.out.println("Motor Encendido");
       bEncendidoMotor = true;
    }
    public void apagarMotor(){
        System.out.println("Motor Apagado");
        bEncendidoMotor = false;
    }
    public void avanzar(){
        System.out.println("Acelerando ...");
        //Falta considerar cuando se llega al limite: dVelocidadMaxima
        if(bEncendidoMotor) {
            dVelocidadActual = dVelocidadActual + dAceleracion;
        }

        System.out.println("Avance - Velocidad = " + dVelocidadActual);
    }
    public void frenar(){
        System.out.println("Frenando ...");
        if(bEncendidoMotor) {
            if(dVelocidadActual >= dDistanciaFrenado) {
                dVelocidadActual = dVelocidadActual - dDistanciaFrenado;
            }else{
                dVelocidadActual = 0;
            }

        }
        System.out.println("Avance - Velocidad = " + dVelocidadActual);
    }
    public void frenarHastaDetener(){
        while(dVelocidadActual > 0){
            frenar();
        }
    }
    public void acelerarAlMaximo(){
        // como aceleran su auto al maximo....
    }



    //Setter and Getter:


    public String getsPlaca() {
        return sPlaca;
    }

    public void setsPlaca(String sPlaca) {
        this.sPlaca = sPlaca;
    }

    public double getdVelocidadMaxima() {
        return dVelocidadMaxima;
    }

    public void setdVelocidadMaxima(double dVelocidadMaxima) {
        this.dVelocidadMaxima = dVelocidadMaxima;
    }

    public boolean isbEncendidoMotor() {
        return bEncendidoMotor;
    }

    public void setbEncendidoMotor(boolean bEncendidoMotor) {
        this.bEncendidoMotor = bEncendidoMotor;
    }

    public boolean isbMovimiento() {
        return bMovimiento;
    }

    public void setbMovimiento(boolean bMovimiento) {
        this.bMovimiento = bMovimiento;
    }

    public boolean isbLucesEncendidas() {
        return bLucesEncendidas;
    }

    public void setbLucesEncendidas(boolean bLucesEncendidas) {
        this.bLucesEncendidas = bLucesEncendidas;
    }

    public double getdDistanciaFrenado() {
        return dDistanciaFrenado;
    }

    public void setdDistanciaFrenado(double dDistanciaFrenado) {
        this.dDistanciaFrenado = dDistanciaFrenado;
    }

    public double getdVelocidadActual() {
        return dVelocidadActual;
    }

    public void setdVelocidadActual(double dVelocidadActual) {
        this.dVelocidadActual = dVelocidadActual;
    }

    public double getdAceleracion() {
        return dAceleracion;
    }

    public void setdAceleracion(double dAceleracion) {
        this.dAceleracion = dAceleracion;
    }
}
