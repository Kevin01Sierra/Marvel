
package logica;



public class ImperioShiAr implements Volar, InteligenciaSobreHumana, SuperFuerza{

    @Override
    public void despegar() {
        System.out.println("Devido a que los Shi'Ar decienden de seres avionicos (aves) algunos tienen huesos hueco los cuales, al extender sus brazos y al dar un salto con bastante fuerza,"
                + "les permite ejercer la fuerza necesaria para despegar el vuelo.");
    }

    @Override
    public void planear() {
        System.out.println("Cuando ganan bastante altura se dejan caer en picada, cierran sus brazos, despues de ganar una gran veleciodad estienden sus brazos y piernas, esto les permite matener"
                + " control en el vuelo.");
    }

    @Override
    public void aterrizar() {
        System.out.println("Estienden sus brazos para perder velocidad, visualizan el suelo,a escasos metro del suelo esconden susu brazos y se dejan caer. Al momento de impactar contra el suelo "
                + "generan un pequña onda y aterrizan apollandose con sus rodillas.");
    }

    @Override
    public void analizar() {
        System.out.println("Debido a que esta raza no tiene capacidad creativa, su concentración es mayor a cualquiera ya que no tienen ningun tipo de distracción y así les permite cumplir con sus objetivos "
                + "y derrotar de manera eficaz y rapida a cualquier enemigo.");
    }

    @Override
    public void crear() {
        System.out.println("Ya que los intereces de esta raza es la expansión a lo largo de la galaxia y posteriormente del universo, sus avances tegnologicos son significativos incluyendo armas y naves impusaldas por luz.");
    }

    @Override
    public void levantar() {
        System.out.println("Esta raza caunta con derivaciones, ya que, aquellos que no logran desarrollar la avilidad de volar pueden generar super fuerza."
                + "Apollan sus manos sobre la base del objeto de gran masa, flexcionan sus piernas, hacen fuerza con los brazos y pasan el objeto sobre sus hombros.");
    }

    @Override
    public void sostener() {
        System.out.println("Ya que cuantan con una gran resistencia, gracias a su biologia, sin mayor esfuerzo logra mantener por un buen tiemepo el objeto de gran masa"
                + "sobre sus brazos.");
    }

    @Override
    public void destrozar() {
        System.out.println("Debido a su fisiologia su cuerpo le permite soportar cualquier ataque, esto quiere decir que son capaces de destruir casi que cualquier material de gran resistencia.");
    }
    
}
