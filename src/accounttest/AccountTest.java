public class AccountTest{
public static void main(String[] args) {
    
    private int prazo; // em meses
    private double taxaDeJuros;

    // Construtor
    public AccountTest(int prazo) {
        if (prazo < 1 || prazo > 60) {
            throw new IllegalArgumentException("O prazo deve estar entre 1 e 60 meses.");
        }
        this.prazo = prazo;
        definirTaxaDeJuros();
    }

    // Método para definir a taxa de juros baseada no prazo
    private void definirTaxaDeJuros() {
        if (prazo <= 11) {
            taxaDeJuros = 0.005; // 0.5% para prazos de 0 a 11 meses
        } else if (prazo <= 23) {
            taxaDeJuros = 0.01; // 1.0% para prazos de 12 a 23 meses
        } else if (prazo <= 35) {
            taxaDeJuros = 0.015; // 1.5% para prazos de 24 a 35 meses
        } else if (prazo <= 47) {
            taxaDeJuros = 0.02; // 2.0% para prazos de 36 a 47 meses
        } else {
            taxaDeJuros = 0.025; // 2.5% para prazos de 48 a 60 meses
        }
    }

    // Método para calcular o valor dos juros para um determinado período
    public double calcularJuros(int meses) {
        return meses * taxaDeJuros;
    }

    public static void main(String[] args) {
       AccountTest titulo = new TituloDoAccount(36); // Criando um título com prazo de 36 meses
        System.out.println("Taxa de juros para o título: " + (titulo.taxaDeJuros * 100) + "%");

        double jurosMes1 = titulo.calcularJuros(1);
        System.out.println("Juros para o primeiro mês: $" + jurosMes1);

        double jurosMes12 = titulo.calcularJuros(12);
        System.out.println("Juros para o décimo segundo mês: $" + jurosMes12);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
