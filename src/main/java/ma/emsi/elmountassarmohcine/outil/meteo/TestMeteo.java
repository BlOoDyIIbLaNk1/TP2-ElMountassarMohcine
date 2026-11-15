package ma.emsi.elmountassarmohcine.outil.meteo;

public class TestMeteo {

    public static void main(String[] args) {
        MeteoTool outil = new MeteoTool();

        boolean pluie = outil.isPluiePrevue(48.85, 2.35, 0, 3);

        System.out.println("Pluie prévue à Paris sur 3 jours : " + pluie);
    }
}