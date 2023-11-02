package Banco;

public class ContaPoupanca extends Conta{
    private Double taxaRendimento;

    ContaPoupanca(int num, Double taxa){
        super(num);
        if (!this.setTaxaRendimento(taxa)); {
            this.taxaRendimento = 0.0;
        }

    }

    public boolean setTaxaRendimento(Double taxa){
        if(taxa > 0 && taxa <1){
            this.taxaRendimento = taxa;
            return true;
        }
            return false; }

        public Double getTaxaRendimento(){
            return this.taxaRendimento;

        }

        public void RendimentoConta(){
            Double rendimento = getSaldo() * this.taxaRendimento;
            super.deposito(rendimento);
         

        }
        
        
    }

