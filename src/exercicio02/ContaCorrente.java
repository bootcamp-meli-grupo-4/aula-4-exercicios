package exercicio02;

public class ContaCorrente {
    private Double saldo;

    public ContaCorrente(Double saldo) {
        this.saldo = saldo;
    }
    public ContaCorrente(ContaCorrente contaCorrente) {
        this.saldo = contaCorrente.getSaldo();
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public void deposito(Double valor){
        this.saldo += valor;
    }

    public void saque(Double valor){
        this.saldo -= valor;
    }

    public void devolucao(Double valor){
        deposito(valor);
    }

    public void transferencia(Double valor, ContaCorrente contaCorrente){
        this.saque(valor);
        contaCorrente.deposito(valor);
    }
}
