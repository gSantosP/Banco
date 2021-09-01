public abstract class Contas {
    public float saldo;

    public abstract void depositarDinheiro(float dinheiro);

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
