import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Tuin {

    public static void main(String[] args) 
    throws IOException
    {
        // Enter data using BufferReader
        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
  
        System.out.println("Welkom in mijn tuin.");
        Sproeier slangetje = new Sproeier();
        TuinDomotica slimmeSchakelaar = new TuinDomotica();
        Zonnescherm zScherm = new Zonnescherm();
        String input = "";
        do
        {
            System.out.println("Regen installatie staat op"+ slimmeSchakelaar.getSlimmeschakelaar());
            System.out.println("Regent het (JA/NEE)");
            input = reader.readLine();
            slimmeSchakelaar.setRegen(input.equalsIgnoreCase("JA"));
            zScherm.setRegen(input.equalsIgnoreCase("JA"));
            
            System.out.println("Is er daglicht (JA/NEE)");
            input = reader.readLine();
            slimmeSchakelaar.setDaglicht(input.equalsIgnoreCase("JA"));
            zScherm.setDaglicht(input.equalsIgnoreCase("JA"));
            slimmeSchakelaar.domoticaRun();
            
            System.out.println("Wilt u de zonnescherm aan (JA/NEE)");
            input = reader.readLine();
            zScherm.setStand(input.equalsIgnoreCase("JA"));
            zScherm.zonneschermRun();
            
            System.out.print("Wilt u stoppen (JA/NEE)");
            input = reader.readLine();

        } while (!input.equalsIgnoreCase("JA"));
        System.out.println(slangetje.getHoseBrand());
        

    }
}