public class Aluno {

            String nome;
            double nota1, nota2, nota3;
            double media;

        public double calcularMedia(double nota1, double nota2, double nota3){
            return media = (nota1+nota2+nota3)/3;
        }

        public String resultado(String nome, double media, double nota1, double nota2, double nota3){
            return "\n\nBoletim do Aluno: " +nome+ ".\n\n  - nota 1 = " +nota1+ "\n  - nota 2 = "+nota2+ "\n  - nota 3 = "+nota3+ "\n\n Sua média é: "+media;
        }




}
