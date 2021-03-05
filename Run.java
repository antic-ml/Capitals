import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * An educational aid for the younger members of the family
 * whose geography maybe a little weak.
 *
 * @author Mario Gianota (gianotamario@gmail.com) 5 March 2021
 */
public class Run {

    private ArrayList<String> countries = new ArrayList<>();
    private ArrayList<String> capitals = new ArrayList<>();

    public Run() {
        countries.add("Afghanistan");
        countries.add("Argentina");
        countries.add("Belgium");
        countries.add("Brazil");
        countries.add("Canada");
        countries.add("Cuba");
        countries.add("Denmark");
        countries.add("Egypt");
        countries.add("England");
        countries.add("France");
        countries.add("Greece");
        countries.add("Italy");
        countries.add("Jamaica");
        countries.add("Nigeria");
        countries.add("Norway");
        countries.add("Portugal");
        countries.add("Russia");
        countries.add("Scotland");
        countries.add("Spain");
        countries.add("U.S.A"); // stupid people live here kids.

        capitals.add("Kabul");
        capitals.add("Buenos Aires");
        capitals.add("Brussels");
        capitals.add("Rio De Janeiro");
        capitals.add("Ottowa");
        capitals.add("Havana");
        capitals.add("Copenhagen");
        capitals.add("Cairo");
        capitals.add("London");
        capitals.add("Paris");
        capitals.add("Athens");
        capitals.add("Rome");
        capitals.add("Kingston");
        capitals.add("Lagos");
        capitals.add("oslo");
        capitals.add("Lisbon");
        capitals.add("Moscow");
        capitals.add("Edinburgh");
        capitals.add("Madrid");
        capitals.add("Washington");

    }

    public void test() throws IOException {
        int count = 0;
        for(int i=0; i<countries.size(); i++) {
            System.out.print("What is the capital of " + countries.get(i) + ": ");
            String c = getCapital();
            if( c.equalsIgnoreCase(capitals.get(i))) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect. Try again.");
                i--;
            }
        }
        System.out.println("Okay, bye bye for now.");
    }

    public String getCapital() throws IOException {
        BufferedReader bufIn = new BufferedReader((new InputStreamReader((System.in))));
        String c = bufIn.readLine();
        return c;
    }

    public static void main(String[] args) throws IOException {
        Run r = new Run();
        r.test();
    }
}
