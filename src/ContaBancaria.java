public class ContaBancaria {

            double saldo = 1500;
            String titular;
            double saque, deposito;


        public double saqueConta (double saldo, double saque){
            return saldo - saque;
        }

        public double depositoConta (double saldo, double deposito){
            return saldo + deposito;
        }



}
