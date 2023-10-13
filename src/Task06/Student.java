package Task06;

public class Student {
    private String name;
    private String family;
    private int age;
    protected int groupe;

    private boolean isHaveBilet;

    public Student(String name, String family, int age, int groupe, boolean isHaveBilet) {
        this.name = name;
        this.family = family;
        this.age = age;
        this.groupe = groupe;
        this.isHaveBilet = isHaveBilet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupe() {
        return groupe;
    }

    public void setGroupe(int groupe) {
        this.groupe = groupe;
    }

    public boolean isHaveBilet() {
        return isHaveBilet;
    }

    public void setHaveBilet(boolean haveBilet) {
        isHaveBilet = haveBilet;
    }
}
