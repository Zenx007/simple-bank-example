public class Caneta {
    public String modelo;
   private float ponta;
   public boolean tampada;
   private String cor;

   public Caneta (String m, String c, float p) {    //método construtor
this.tampar ();
this.cor = c;
this.setPonta (p);
this.setModelo (m);


   }


    public void status () {
        System.out.println("Sobre a caneta:" );
        System.out.println("Modelo:" + this.getModelo());
        System.out.println("Ponta:" + this.getPonta());
        System.out.println("A caneta está tampada:" + this.tampada);
        System.out.println("A cor da caneta é " + this.cor);
    }
    public String getModelo () {
        return this.modelo;
    }

    public void setModelo  (String m) {
        this.modelo = m;

    }
    public float getPonta () {
        return this.ponta;
    }

    public void setPonta (float p) {
       this.ponta = p;
    }

    public void tampar () {
       this.tampada = true;
    }

    public void destampar () {
       this.tampada = false;}




}
