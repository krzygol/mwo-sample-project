package pl.edu.agh.mwo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        // Odczyt pliku json do List<Pitstop>
        try {
            var pitstops = FileLoader.loadPitstops("src/main/resources/pitstops-data.json");

            for (Pitstop pitstop : pitstops) {
                System.out.println(
                                "session=" + pitstop.getSessionKey() +
                                " meeting=" + pitstop.getMeetingKey() +
                                " date=" + pitstop.getDate() +
                                " driver=" + pitstop.getDriverNumber() +
                                " duration=" + pitstop.getPitDuration() +
                                " lap=" + pitstop.getLapNumber()
                );
            }
        } catch (java.io.IOException e) {
            System.err.println("Błąd podczas wczytywania pliku JSON: " + e.getMessage());
            e.printStackTrace();
        }


    }


}
