public abstract class InstrumentoFinanceiro {
    float saldo;

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }
    public abstract float calcularSaldoTotal();

}
