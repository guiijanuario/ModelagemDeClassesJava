package ListaB.caixa;

public class Caixa {
    Double saldo;

    public Caixa() {
        saldo = 1000.0;
    }

    public void credito(double valor) {
        saldo += valor;
    }

    public void debito(double valor) {
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
