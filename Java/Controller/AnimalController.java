package Controller;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;
import java.util.Scanner;
/**
 * AnimalController
 */

import Model.Animal;
import Model.Pack_animal;
import Model.Pet_animal;
public class AnimalController implements Controller<Animal> {

    List<Animal> list= new ArrayList<>();
    List<String> commands = new ArrayList<>();
    int id = 0;

     public Animal animal(String name, LocalDate date, int type, int PetOrPackType)
    {
        Animal animal;
        if (type == 0) {
            animal = new Pet_animal(name, date, type, PetOrPackType);
            addDataToList(animal); 
            animal.getString();
            return animal;
        }        
        if (type == 1) {
            animal = new Pack_animal(name, date, type, PetOrPackType);
            addDataToList(animal); 
            return animal;
        }
        return null;
    }

    public void CrateAnimal(String name, LocalDate date, Integer type, int PetOrPackType)
    {
        Animal animal = animal(name, date, type, PetOrPackType);            
    }

    public void addDataToList(Animal animal)
    {
        int id = 0;
        for (int i=0; i < list.size()+1; i++)
        id = i;        
        list.add(animal);
        animal.setID(id);
        updateCommands();        
    }

    public void getAllAnimal()
    {
        for (int i=0; i < list.size(); i++)
        {
            list.get(i).getString();
            System.out.println("Команды животного: " + getCommandsById(i) + "\n"); 
            
        }
    }

    public void getTypeAnimal(int type)
    {
        int counter = 0;
        for (int i=0; i < list.size(); i++)
        {
            if(list.get(i).getType() == type)
            {
                list.get(i).getString();
                System.out.println("Команды животного: " + getCommandsById(i) + "\n"); 
                counter++;
            }
        }
        if (counter == 0) System.out.println("Список пуст");
    }

    public void removeAnimal(int id)
    {
        for (int i=0; i < list.size(); i++)
        {
            if (id == i)
            {
                list.remove(i);
            }
            
        }
        for (int i=0; i < list.size(); i++)
        {
            list.get(i).setID(i);
        }
        System.out.println("Выбранное животное удалено.");
        
    }
    public void updateAnimal(int id)
    {
        for (int i=0; i < list.size() ; i++)
        {
            if(id == i)
            {
                System.out.println("Введите новые данные: ");
                String nameUp = "david";
                LocalDate date = LocalDate.of(2004, 05, 12);
                list.get(i).setName(nameUp);
                list.get(i).setBirthDay(date);
            }
        }
    }

    public Animal getById(int id)
    {
        for (int i=0; i < list.size() ; i++)
        if (i == id) {
            return list.get(i);
        }
        return null;
    }

    public void updateCommands()
    {
        commands.add("");
    }

    public void getCommands(){
        System.out.println("Все команды: \n");
        for (int i = 0; i < commands.size(); i++) {
            System.out.println(commands.get(i) );
        }
    }

    public String getCommandsById(int id)
    {
        return commands.get(id);
    }

    public String addComand(int id)
    {
        if(list.size()<=id){
            System.out.println("\nНе существует существа с данным id");
            return "";
        }
        System.out.println("\nВведите команду:\n");
        Scanner in = new Scanner(System.in);
        String command = in.next();
        System.out.println(command);
        
        if(commands.get(id) == "")
        {
            commands.set(id, command);
        }

        else{
            commands.set(id, commands.get(id) + ", " + command);
        }

        return commands.get(id);
    }
}