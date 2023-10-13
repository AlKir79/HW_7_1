package Task06;

public class Bilet {
    private int number;
    private String nameStudent;
    private String familyStudent;
    protected int groupeStudent;

    public Bilet(int number, Student student) {
        this.number = number;
        this.nameStudent = student.getName();
        this.familyStudent = student.getFamily();
        this.groupeStudent = student.getGroupe();
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getFamilyStudent() {
        return familyStudent;
    }

    public void setFamilyStudent(String familyStudent) {
        this.familyStudent = familyStudent;
    }

    @Override
    public String toString() {
        return "\n Билет № " + number +
                " Имя студента " + nameStudent + '\'' +
                ", Фамилия студента " + familyStudent + '\'' +
                ", группа " + groupeStudent;
    }
}
