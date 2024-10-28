package Model;

import java.time.LocalDate;

public class Pet_animal extends Animal {
    private int type_pet;
    // private String name;
    // private LocalDate date_birthday;
    // private int type;
    
    public Pet_animal(String name, LocalDate date_birthday, int type, int type_pet)
    {
        super(name, date_birthday, type);
        this.type_pet = type_pet;
    }

    public String getTypePet_animal()
    {
        if(type_pet == 0) return "Собака";
        if(type_pet == 1) return "Кошка";
        if(type_pet == 2) return "Хомяк";
        return null;
    }

    public void getString()
    {
        System.out.println("\nId животного: " + super.getId() +  "; Имя выбранного животного: " + super.getName() + "; Дата рождения выбранного животного: " + super.getBirthDay() + "; Тип животного: " + super.getTypeString() + "; Вид животного: " + this.getTypePet_animal()); 
    }
}
