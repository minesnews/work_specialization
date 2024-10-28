package Model;

import java.time.LocalDate;

public class Pack_animal extends Animal {

    private int type_pet;
    // private String name;
    // private LocalDate date_birthday;
    // private int type;

    public Pack_animal(String name, LocalDate date_birthday, int type, int type_pet)
    {
        super(name, date_birthday, type);
        this.type_pet = type_pet;
    }

    public String getTypePack_animal()
    {
        if(this.type_pet == 0) return "Лошадь";
        if(this.type_pet == 1) return "Верблюд";
        if(this.type_pet == 2) return "Осел";
        return null;
    }

    public void getString()
    {
        System.out.println("\nId животного: " + super.getId() +  "; Имя выбранного животного: " + super.getName() + "; Дата рождения выбранного животного: " + super.getBirthDay() + "; Тип животного: " + super.getTypeString() + "; Вид животного: " + this.getTypePack_animal()); 
    }
}
