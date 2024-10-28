package ViewInterface;

import java.util.Scanner;
import java.time.LocalDate;
import Controller.AnimalController;
import Controller.Controller;
import Model.Animal;

public class Menu implements View {

    //AnimalController animalController;
    Controller<Animal> animalController = new AnimalController();

    public Menu(Controller<Animal> controller){
        this.animalController = controller;
    }
    @Override
    public void showInterface (){        

        String textMenu = "\nДобро пожаловать в питомник. Выберите категорию животного или посмотрите весь список животных.\n" +

                    "1. Домашнее животное\n" +
                    "2. Вьючное животное\n" +
                    "3. Посмотреть весь список животных\n" +
                    "4. Список команд животного по его id\n" +
                    "5. Добавить новую команду для животного с id {}\n" +
                    "0. Выход";

        System.out.println(textMenu);
        inputData();
    }

    @Override
    public void inputData(){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        switch (input) {
            case "0":
                break;
            case "1":
                System.out.println("Такой вариант есть");
                View Level1_2 = new Menu2(0, animalController);
                Level1_2.showInterface();
                break;
            case "2":
                System.out.println("И такой вариант тоже есть");
                System.out.println("Такой вариант есть");
                View Level2_2 = new Menu2(1, animalController);
                Level2_2.showInterface();
                break;
            case "3":
                animalController.getAllAnimal();
                showInterface();
                break;
            case "4":
                //animalController.getAllAnimal();
                showInterface();
                break;
            case "5":
                System.out.println("Список животных, которым можно добавить команды: ");
                animalController.getAllAnimal();
                addCommandAnimal();
                showInterface();
                break;
            default:
                System.out.println("Ошибка: такого варианта нет");
                showInterface();
                break;
        }
    }

    public void addCommandAnimal(){
        animalController.getCommands();
        System.out.println("\nДобавим команду животному с id (введите в коноль):\n");
        Scanner in = new Scanner(System.in);
        Integer id = in.nextInt();
        System.out.println(animalController.addComand(id));
        animalController.getCommands();
    }
}
