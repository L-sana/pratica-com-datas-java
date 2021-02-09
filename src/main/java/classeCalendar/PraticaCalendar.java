package classeCalendar;

import java.util.Calendar;

public class PraticaCalendar {
    public static void main(String[] args) {

        Calendar agora = Calendar.getInstance();

        System.out.println("A data corrente é: " + agora.getTime());

//        agora.add(Calendar.DATE, -15);
//        System.out.println("15 dias atrás: " + agora.getTime());
//
//        agora.add(Calendar.MONTH, 4);
//        System.out.println("4 Meses a frente: " + agora.getTime());
//
//        agora.add(Calendar.YEAR, 10);
//        System.out.println("10 anos a frente: " + agora.getTime());

        // Formas de Imprimir:

        System.out.printf("%Tc\n", agora);
        //TER FEV 09 19:08:23 GMT-03:00 2021

        System.out.printf("%TF\n", agora);
        //2021-02-09

        System.out.printf("%TD\n", agora);
        //02/09/21

        System.out.printf("%Tr\n", agora);
        //07:11:16 PM               12hrs

        System.out.printf("%TT\n", agora);
        //19:11:41                  24hrs



    }

}
