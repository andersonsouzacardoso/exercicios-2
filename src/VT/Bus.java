package VT;

public class Bus {
    public static void main(String[] args) {
        ValeTransporte passagem = new ValeTransporte();
        passagem.cartao = 10.00;
        passagem.tarifa = 5.30;
        passagem.pagarpassagem();
    }
}
