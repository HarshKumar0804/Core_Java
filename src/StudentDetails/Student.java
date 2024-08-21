package StudentDetails;

public class Student {
    private int id;
    private String name;
    private char gender;
    private String branch;

    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public char getGender() {
        return gender;
    }
    public String getBranch() {
        return branch;
    }

    public boolean setName(String name) {
        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);
            if (!((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || ch == ' ')) {
                return false;
            }
        }
        this.name = name;
        return true;
    }

    public boolean setId(int id) {
        if (id >= 100000000 && id <= 999999999) {
            this.id = id;
            return true;
        }
        return false;
    }

    public boolean setGender(char gender) {
        if (gender == 'M' || gender == 'F' || gender == 'm' || gender == 'f') {
            this.gender = gender;
            return true;
        }
        return false;
    }

    public boolean setBranch(String branch) {
        if (branch.equals("BCA") || branch.equals("BBA") || branch.equals("CE") || branch.equals("CSE") ||
                branch.equals("ECE") || branch.equals("EEE") || branch.equals("ECS") || branch.equals("ME") ||
                branch.equals("PE") || branch.equals("MCA")) {
            this.branch = branch;
            return true;
        }
        return false;
    }

    public String toString() {
        return String.format("ID: %d\nName: %s\nGender: %c\nBranch: %s", this.getId(), this.getName(), this.getGender(), this.getBranch());

    }
}
