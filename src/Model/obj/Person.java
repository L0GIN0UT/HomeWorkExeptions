package Model.obj;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Person implements Serializable{

    private long id;
    private String familia;
    private String name;
    private String otchestvo;
    private LocalDate bornDate;
    private long phoneNumber;
    private Gender gender;

    public Person(String familia, String name, String otchestvo, LocalDate bornDate, long phoneNumber, Gender gender) {
        id = -1;
        this.familia = familia;
        this.name = name;
        this.otchestvo = otchestvo;
        this.bornDate = bornDate;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    private int lifePeriod(LocalDate birthDate, LocalDate now) {
        Period difference = Period.between(birthDate, now);
        return difference.getYears();
    }

    public int getAge() {
        return lifePeriod(bornDate, LocalDate.now());
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id);
        sb.append(" Фамилия: ").append(familia);
        sb.append(" Имя: ").append(name);
        sb.append(" Имя: ").append(otchestvo);
        sb.append(" Пол: ").append(gender);
        sb.append(" ДР: ").append(bornDate);
        sb.append(" Телефон: ").append(phoneNumber);
        sb.append(" Возраст: ").append(getAge());
        return sb.toString();
    }

    public String toString() {
        return info();
    }


    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOtchestvo() {
        return otchestvo;
    }

    public void setOtchestvo(String otchestvo) {
        this.otchestvo = otchestvo;
    }

    public LocalDate getBornDate() {
        return bornDate;
    }

    public void setBornDate(LocalDate bornDate) {
        this.bornDate = bornDate;
    }

    public long getNumber() {
        return phoneNumber;
    }

    public void setNumber(long number) {
        this.phoneNumber = number;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
