package ListaA.contaCorrente;

public class ContaCorrente {

    Integer numeroConta;
    String nomeCorrentista;
    Integer saldo;

    public ContaCorrente(Integer numeroConta, String nomeCorrentista, Integer saldo) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public ContaCorrente(Integer numeroConta, String nomeCorrentista) {
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = 0;
    }

    public void depositoConta(Integer valor) {
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
    }

    public void saqueConta(Integer valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso. Saldo atual: R$" + saldo);
        } else {
            System.out.println("Saldo insuficiente. Não foi possível realizar o saque.");
        }
    }

}
