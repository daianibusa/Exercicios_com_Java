/* Os pares de instruções abaixo produzem o mesmo resultado?
A <-- (4/2)+(2/4) E 4/2+2/4
B <-- 4/(2+2)/4 E 4/2+2/4
C <-- (4+2)*2-4 E 4+2*2-4
 */

public class Exercicio01 {
    public static void main(String[] args) {

        // A <-- (4/2)+(2/4) E 4/2+2/4
        double calcularA1 = (4.0/2.0)+(2.0/4.0);
        System.out.println("A = (4/2)+(2/4) = " + calcularA1);
        double calcularA2 = 4.0/2.0+2.0/4.0;
        System.out.println("A = 4/2+2/4 = " + calcularA2);

        // B <-- 4/(2+2)/4 E 4/2+2/4
        double calcularB1 = 4.0/(2.0+2.0)/4.0;
        System.out.println("B = 4/(2+2)/4 = " + calcularB1);
        double calcularB2 = 4.0/2.0+2.0/4.0;
        System.out.println("B = 4/2+2/4 = " + calcularB2);

        // C <-- (4+2)*2-4 E 4+2*2-4
        double calcularC1 = (4.0+2.0)*2.0-4.0;
        System.out.println("C = (4+2)*2-4 = " + calcularC1);
        double calcularC2 = 4.0+2.0*2.0-4.0;
        System.out.println("C = 4+2*2-4 = " + calcularC2);

    }
    }

