package ViewInterface;

import Controller.AnimalController;
import Controller.Controller;
import Controller.Counter;
import Model.Animal;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Menu2 implements View {
    private int type;
    Scanner get;
    Scanner in = new Scanner(System.in);
    //private AnimalController controller;
    Controller<Animal> controller = new AnimalController();
    public Menu2(int type, Controller<Animal> controller){
         this.type = type;
         this.controller = controller;
    }

    @Override
    public void showInterface (){  
        String typeAnimal = "";      
        if(type == 0) typeAnimal = "домашнее";
        if(type == 1) typeAnimal = "вьючное";
        String textMenu =
        "\nВы выбрали " + typeAnimal +" животное.\nВыберите следующие пункты меню:\n" +
                    "1. Список всех животных типа {" + typeAnimal +  " животное}\n" +
                    "2. Добавить в питомник новое {" + typeAnimal + " животное}\n" +
                    "3. Список команд животного типа {" + typeAnimal + " животное}\n" +
                    "4. Добавить новую команду для животного типа {" + typeAnimal + " животное}\n" +
                    "5. Удалить из базы животное типа {" + typeAnimal + " животное}\n" +
                    "0. Предыдущий пункт меню";

        System.out.println(textMenu);
        inputData();
    }

    @Override
    public void inputData()
    {
       
        String input = in.next();
        Counter count = new Counter();
        switch (input) {
            case "0":
                View ViewLevel1 = new Menu(controller);
                ViewLevel1.showInterface();
                break;
            case "1":
                controller.getTypeAnimal(type);
                count.add();
                showInterface();
                break;
            case "2":
                String name = getName();
                try{
                    LocalDate date = getBirthday();
                    int typeInt =  TypePetOrPack(type);
                    controller.CrateAnimal(name, date, type, typeInt);
                }
                catch (DateTimeParseException e)
                {
                    System.err.println("Error: Неправильный формат даты!");
                }                
                showInterface();
                break;
            case "3":
                System.out.println("Такой вариант есть");
                break;
            case "4":
                System.out.println("Такой вариант есть");
                break;
            case "5":
                int id = choiseAnimal();
                if(id != -1)
                controller.removeAnimal(id);
                showInterface();
                break;
            default:
                System.out.println("Такого варианта нет");
                showInterface();
                break;
        }
    }
    public String getName()
    {
        System.out.println("Введите имя животного");
        String name = in.next();
        return name;
    }

    public LocalDate getBirthday() throws DateTimeParseException {
        
        System.out.print("Введите дату рождения в формате 'dd.mm.yyyy': ");
        String strDate = in.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date = LocalDate.parse(strDate, formatter);
        return date;
        
    }

    public int TypePetOrPack(int type)
    {
        if (type == 0) {
            System.out.println("\nВыберите вид домашнего животного:\n1.Собака\n2.Кошка\n3.Хомяк");
            String input = in.next();
            switch (input)
            {
                case "1":
                    return 0;
                case "2":
                    return 1;
                case "3":
                    return 2;
                default:
                    System.out.println("Такого варианта нет");
                    break;
            }
        }
        if (type == 1){
            System.out.println("\nВыберите вид вьючного животного:\n1.Лошадь\n2.Верблюд\n3.Осёл");
            String input = in.next();
            switch (input)
            {
                case "1":
                    return 0;
                case "2":
                    return 1;
                case "3":
                    return 2;
                default:
                    System.out.println("Такого варианта нет");
                    break;
            }
        }
        return -1;
    }

    public int choiseAnimal()
    {
        System.out.println("\nВведите номер животного, -1 для возврата в основное меню: ");
        while (true) {
            int id = in.nextInt();
            if (id == -1)
                return id;
            if (controller.getById(id) == null) {
                System.out.println("Животного с таким номером нет, попробуйте еще раз, -1 для возврата в основное меню:");
            } else
                return id; 
        }
    }
}
