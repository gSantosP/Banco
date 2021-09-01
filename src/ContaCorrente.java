public class ContaCorrente extends Contas {
    protected float valorAutSaque;
    protected float dinDeposito;
    public Cliente cliente;

    public void depositarDinheiro(float dinDeposito){
        this.saldo += dinDeposito;
    };
    public void sacarDinheiro(float saque){
        this.saldo -= saque;
    };

    public float getValorAutSaque() {
        return valorAutSaque;
    }

    public void setValorAutSaque(float valorAutSaque) {
        this.valorAutSaque = valorAutSaque;
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
