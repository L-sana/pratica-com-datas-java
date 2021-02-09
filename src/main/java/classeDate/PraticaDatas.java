package classeDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class PraticaDatas {
    public static void main(String[] args) throws ParseException {

        String dataAniversario;
        Date dataParaComparar = new Date(1273892400000L); //15-05-2010 00:00:00

        SimpleDateFormat sdf = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
        Scanner ent = new Scanner(System.in);

        System.out.println("Digite s data de seu aniversário para descobrir o millesegundo, utilize o seguinte exemplo:\ndd-MM-yyyy hh:mm:ss (deve ser digitado neste modelo contendo os caracteres '-' e ':' )");
        dataAniversario = ent.nextLine();

        Date date = sdf.parse(dataAniversario);
        System.out.println("Sua data de aniversario em Millessegundo é: "+date.getTime());

        System.out.println("-------------------------------------");
        System.out.println("A data para comparação é 15-05-2010 00:00:00");
        System.out.println("-------------------------------------");


        //Verifica se a data de aniversario é anterior a data de comparação
        boolean isBefore = date.before(dataParaComparar);

        System.out.println(isBefore == true? "A data de Aniversario é Anterior a data de comparação!" : "A data de Aniversario não é Anterior a data de comparação!");

        //Verifica se a data de aniversario é posterior a data de comparação
        boolean isAfter = date.after(dataParaComparar);

        System.out.println(isAfter == true? "A data de Aniversario é posterior a data de comparação!" : "A data de Aniversario não é Posterior a data de comparação!");

    }
}
