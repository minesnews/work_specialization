package Controller;

import Model.Animal;
import java.time.LocalDate;

public interface Controller<T extends Animal> {
    public T animal(String name, LocalDate date, int type, int PetOrPackType);
    public void CrateAnimal(String name, LocalDate date, Integer type, int PetOrPackType);
    public void addDataToList(T animal);
    public void getAllAnimal();
    public void getTypeAnimal(int type);
    public void removeAnimal(int id);
    public void updateAnimal(int id);
    public T getById(int id);
    public void updateCommands();
    public String getCommandsById(int id);
    public String addComand(int id);
    public void getCommands();
}
