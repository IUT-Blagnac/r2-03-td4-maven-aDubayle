
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
public class Geometrie
{
    /**
     * @param diametre
     *      Le diametre du disque (nombre positif).
     * @return la surface du disque
     */
    public static double surfaceDisque(double diametre) {
        double pi, rayon, surface;
        // Endroit pour transcrire l'algorithme en Java
        pi = 3.1415 ;
        rayon = diametre/2 ;
        surface = pi * rayon * rayon ;

        return surface;

    }

    /**
     * @param longueur
     *      La longueur du rectangle (nombre positif).
     * @param largeur
     *      La largeur du rectangle (nombre positif, inférieur ou égal à la longueur).
     * @return la surface du rectangle
     */
    public static double surfaceRectangle(double longueur, double largeur) {
        double surface;
        // Endroit pour transcrire l'algorithme en Java
        surface = longueur * largeur;

        return surface;
    }

    /**
     * @param cote
     *      La longueur d'un cote du carré (nombre positif).
     * @return la surface du carré
     */
    public static double surfaceCarre(double cote) {
        double surface;
        surface = surfaceRectangle(cote, cote);
        return surface;
    }

    /**
     * Surface du gazon, en m2. Toutes les données sont en m.
     * Terrain, maison, appenti et piscine s'organisent comme vu en TD.
     */
    public static double surfaceGazon(double longueurTerrain, double largeurTerrain,
    double diametrePiscine, double longueurMaison, double largeurMaison, double longueurAppenti) {
        double surfaceGazon;
        double Maison;
        double Piscine;
        double Appentis;
        double Terrain;
        double pi;
        double VTonte;
        double temps;

        /* déclaration des variables de travail */
        // à vous !
        Maison = longueurMaison * largeurMaison;
        pi = 3.14;
        Piscine = (diametrePiscine/2)  * (diametrePiscine/2) * pi;
        Appentis = largeurMaison * longueurAppenti;
        Terrain = longueurTerrain * largeurTerrain;
        VTonte = 100;
        


        /* calcul de la surface à tondre */
        // à vous !
        surfaceGazon = Terrain - (Maison + Piscine + Appentis);
        temps = surfaceGazon/100;
        
        System.out.println("Il y a " + surfaceGazon + " m2 à tondre");

        return surfaceGazon;
        

    }

}
