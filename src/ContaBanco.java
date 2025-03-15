public class ContaBanco {
    public int nc;
    protected String tipo;
    private String dono;
    private float saldo;
    public boolean sc;

    public ContaBanco () {
        this.setSaldo(0);
        this.setSc(false);
    }


    public void Status () {
        System.out.println("-----------------------------------");
        System.out.println("O Nome do dono é:" + this.getDono());
        System.out.println("O número da conta é" + this.getNc());
        System.out.println("O tipo de conta é" + this.getTipo());
        System.out.println("O seu saldo é de:" + this.getSaldo());
        System.out.println("O status atual da conta é" + this.getSc());

    }

    public boolean getSc() {
        return this.sc;
    }

    public void setSc(boolean s) {

        this.sc = s;
    }
    public void abrirConta(String t) {
        this.setTipo(t);
        this.setSc(true);
        if (t == "CC") {
            this.setSaldo(50);
        } else if (t == "CP") {
            this.setSaldo(150);
        }
        System.out.println("A conta está aberta");

    }

     public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.println("A conta ainda possui dinheiro");
        }
else if(this.getSaldo() < 0) {
    System.out.println("A conta possui um debito");
        }
else {
    setSc(false);
    System.out.println("Conta encerrada");

}

    }

    public void deposito(float v){
        if (this.getSc ()) {
            this.setSaldo(this.getSaldo()+ v);
            System.out.println("Valor depositado"); }
            else {
                System.out.println("Impossivel depositar");
            }

        }


    public String getTipo() {
        return this.tipo;
    }

    public void setTipo (String t){

        this.tipo = t;
    }
    public String getDono() {
        return this.dono;
    }

    public void setDono(String d) {

        this.dono= d;
    }

    public float getSaldo() {
        return this.saldo;
    }
    public void setSaldo(float s) {
        this.saldo= s;
    }

    public int getNc() {
        return this.nc;
    }

    public void setNc(int nc) {

        this.nc= nc;
    }

    public void saque (float v) {
        if (this.getSc()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque conlcuido na conta de" + this.getDono());
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel sacar");
        }
    }

    public void pagarMensal () {
        float v= 0f;

        if (this.getTipo() == "corrente") {
            v = 12f;

        } else if (this.getTipo() == "CP") {
            v = 20f;
        }
        if (this.getSc()) {
            if (this.getSaldo() > v) {
                this.setSaldo(getSaldo() - v);
                System.out.println("Pagamento mensal efetuado");
            } else {
                System.out.println("Saldo insuficiente");
            }
        } else {
            System.out.println("Impossivel pagar");
        }
    }
    public void ContaStatus () {
        if (sc == true) {
            System.out.println("A conta está ativa");
        } else {
            System.out.println("A conta está desativada");
        }

    }
