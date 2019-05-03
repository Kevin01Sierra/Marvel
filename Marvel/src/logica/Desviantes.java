
package logica;


public class Desviantes implements SuperFuerza, LanzamientoDeProyectiles{

    @Override
    public void levantar() {
        System.out.println("Al ser una raza alterada geneticamente algunos logran generar mutaciones, entre unas más reconocidas son la de la super fuerza."
                + " Su fuerza es mayor a la del ser humano, pero tienen un limite debido a que no son omnipotentes y siplemente son una derivada de la raza humana."
                + "Flexciona sus rodillas, con sus brazos toma de la base el objeto y con dificualtad logra levantarlo.");
    }

    @Override
    public void sostener() {
        System.out.println("Puede mantener el objeto de gran masa por ensima de sus hombros, pero no por mucho tiempo, ya que al pasar el tiempo sus musculos no recisten mucho.");
    }

    @Override
    public void destrozar() {
        System.out.println("Gracias a esta fuerza sobre humana puede despedazar variedad de matriales 'Con gran densidad' que se encuentran en la tierra o en cierto numero de planetas, puede llegarles a costar, "
                + "pueden llegar a doblegar dicho material.");
    }

    @Override
    public void apuntar() {
        System.out.println("Debido a que su desarrollo evolutivo es más avanzado que el de los seres humanos, logran tener un desarrollo tecnologico es bastante diverso, sobre todo en el tema belico."
                + " Esto permite que las miras de sus armas sean de apuntado automatico y le permitan seleccionar a varios objetivos en el campo de tiro, esta mira cuenta con varias modalidades las cuales son: Asalto y Francotirador.");
    }

    @Override
    public void disparar() {
        System.out.println("Al apretar el gatillo, en la mayoria de veces, logra acertar y abatir al objetivo con gran precisión.");
    }

    @Override
    public void recargar() {
        System.out.println("La mayoria de los cartuchos con los que cuentan sus armas son de energia pura y permiten que sus rafagaz de balas sean costantes hasta que el tiempo de carga del arma se agota o se sobrecalienta.");
    }
    
}
