// Crea un oggetto data da questa stringa 2023-03-01T13:00:00Z
//ottieni l'anno
//ottieni il mese
//ottieni il giorno
//ottieni il giorno della settimana
//Stampa i risultati sulla console

import java.time.OffsetDateTime;


public class Main {
    public static void main(String[] args) {
        OffsetDateTime esDate = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String dataAnno = String.valueOf(esDate.getYear());
        System.out.println("L'anno ottenuto è: " + dataAnno);

        String dataMese = String.valueOf(esDate.getMonth());
        System.out.println("Il mese ottenuto è: " + dataMese);

        String dataGiorno = String.valueOf(esDate.getDayOfMonth());
        System.out.println("Il giorno del mese ottenuto è: " + dataGiorno);

        String dataGiornoDellaSettimana = String.valueOf(esDate.getDayOfWeek());
        System.out.println("Il giorno della settimana ottenuto è: " + dataGiornoDellaSettimana);


    }
}
