package ch10;

public class Member {
    private String id;
    private String pwd;
    private String gender;
    private String department;
    private String[] hobby;
    private String strhobby;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setHobby(String[] hobby) {
        strhobby = " ";
        for (int i = 0; i < hobby.length; i++) {
            strhobby += (hobby[i] + " ");
        }
        this.hobby = hobby;
    }

    public String getStrhobby() {
        return strhobby;
    }
}
