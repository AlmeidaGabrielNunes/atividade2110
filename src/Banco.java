import java.util.ArrayList;

public class Banco {
    private ArrayList<InstrumentoFinanceiro> instrumentos;
    private int numInstrumentos;

    public Banco() {
        this.instrumentos = new ArrayList<>();
        this.numInstrumentos = 0;
    }

    public void adicionar(InstrumentoFinanceiro instrumento) {
        if (instrumento != null) {
            instrumentos.add(instrumento);
            numInstrumentos++;
        }
    }

    public float calcularSaldos() {
        float saldoTotal = 0;
        for (InstrumentoFinanceiro instrumento : instrumentos) {
            saldoTotal += instrumento.calcularSaldoTotal();
        }
        return saldoTotal;
    }

    public int getNumInstrumentos() {
        return numInstrumentos;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Acao acao = new Acao();
        acao.setSaldo(100);
        acao.setCotas(50);
        banco.adicionar(acao);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.setSaldo(500);
        contaCorrente.setLimite(1000);
        banco.adicionar(contaCorrente);

        FundoDeAplicacao fundo = new FundoDeAplicacao();
        fundo.setSaldo(200);
        fundo.setRentabilidade(5);
        banco.adicionar(fundo);

        System.out.println("Número de instrumentos: " + banco.getNumInstrumentos());
        System.out.println("Saldo total dos instrumentos: " + banco.calcularSaldos());
    }
}
