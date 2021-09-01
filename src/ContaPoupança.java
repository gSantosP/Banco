public class ContaPoupança extends Contas {
    protected float taxaJuros;
    protected float dinDeposito;
    public Cliente cliente;

    public void depositarDinheiro(float dinDeposito){
        super.saldo += dinDeposito;
    };
    public void sacarDinheiro(float saque){
        super.saldo = super.saldo - saque;
    };
    public void cobrarJuros(float saldo, float taxaJuros){
        this.taxaJuros += super.saldo;

    };

    public float getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(float taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public float getDinDeposito() {
        return dinDeposito;
    }

    public void setDinDeposito(float dinDeposito) {
        this.dinDeposito = dinDeposito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
