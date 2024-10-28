package Model;

import java.time.LocalDate;

public class Animal {
    private String name;
    private LocalDate date_birthday;
    private int type;
    private int id;

    public Animal (String name, LocalDate date_birthday, int type)
    {
        this.name = name;
        this.date_birthday = date_birthday;
        this.type = type;
    }

    public void setID (int id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name; 
    }

    public void setBirthDay(LocalDate date)
    {
        this.date_birthday = date; 
    }

    public String getName()
    {
        return name;
    }

    public LocalDate getBirthDay()
    {
        return date_birthday;
    }

    public int getType()
    {
        return type;
    }

    public int getId()
    {
        return id;
    }

    public String getTypeString()
    {
        if(this.type == 0) return "Домашнее";
        if(this.type == 1) return"Вьючное";
        return null;
    }

    public void getString()
    {
        String typeString = "";
        if(this.type == 0) typeString = "Домашнее";
        if(this.type == 1) typeString = "Вьючное";
        System.out.println("\nId животного: " + this.id +  "; Имя выбранного животного: " + this.name + "; Дата рождения выбранного животного: " + this.date_birthday + "; Тип животного: " + typeString);
    }
}
