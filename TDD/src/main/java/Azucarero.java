public class Azucarero {
    private int cantidadAzucar;

    public Azucarero(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }

    public boolean hasAzucar(int cantidadAzucar) {
        return this.cantidadAzucar >= cantidadAzucar;
    }

    public void giveAzucar(int cantidadAzucar) {
        this.cantidadAzucar -= cantidadAzucar;
    }
}