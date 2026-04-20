package VT;
// Três Variaveis e um método. (Cartão valor = R$ 10,00 -- Tarifa valor = R$ 5,30 -- Saldo = desconto do cartão - matricula).
public class ValeTransporte {
    public double cartao;
    public double tarifa;
    public double saldo;
// Método com a lógica do desconto de passagem e valor restante em saldo.
    void pagarpassagem(){
        if (cartao >= tarifa){
            saldo = cartao - tarifa;
            System.out.println("Pagamento do Vale transporte aprovado ");
            //%.2f serve para a variavel double adcionar 2 casas depois da virgula!
            System.out.println("####################################################################");
            System.out.println("Seu salto atual é: R$ " + String.format("%.2f", saldo));
        }else {
                saldo = cartao;
            System.out.println("Acesso Negado, saldo menor que a tarifa de R$ 5,00  ");
            System.out.println("####################################################");
            System.out.println("Seu salto atual é: R$ " + String.format("%.2f", saldo));

        }
    }
}
