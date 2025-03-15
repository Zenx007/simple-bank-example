public class Main {
    public static void main(String[] args) {
        ContaBanco cb1 = new ContaBanco ();
       cb1.setNc( 111);
       cb1.setDono("Jubileu");
       cb1.abrirConta("CC");
       cb1.deposito(300f);
       cb1.saque(1000f);
       cb1.Status();

       ContaBanco cb2 = new ContaBanco();

        cb2.setNc(222);
       cb2.setDono("Creusa");
       cb2.abrirConta("CP");
       cb2.deposito(500f);
        cb2.Status();
        }
    }
