
import java.time.LocalDate;

import Controller.AnimalController;
import Controller.Controller;
import Model.Animal;
import Model.Pet_animal;
import Model.Pack_animal;
import ViewInterface.Menu;
import ViewInterface.View;

public class Program {
    public static void main(String[] args) {
        Controller<Animal> controller = new AnimalController();

        View menu = new Menu(controller);
        menu.showInterface();

        //Animal an = new Pet_animal("test", LocalDate.of(2014, 12, 31), 0);
        // Animal animal = new Pet_animal("test", LocalDate.of(2014, 12, 31), 0, 1);
        // animal.getString();
        // animal.getId();


        //Pet_animal animal2 = new Animal("test", LocalDate.of(2014, 12, 31), 0);

        // controller.createAnimal("test", LocalDate.of(2014, 12, 31), 0);
        // controller.createAnimal("test2", LocalDate.of(2013, 12, 31), 1);
        // controller.createAnimal("test3", LocalDate.of(2013, 12, 31), 0);
        // controller.getAllAnimal();
        // controller.removeAnimal(1);
        // controller.getAllAnimal();
        // controller.updateAnimal(1);
        // controller.getAllAnimal();
    }
}
