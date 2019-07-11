public class Preson {
    private String name;
    private Mobile mobile;

    public Preson(String name, Mobile mobile) {
        this.name = name;
        this.mobile = mobile;
    }

    public Preson() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Preson{" +
                "name='" + name + '\'' +
                ", mobile=" + mobile +
                '}';
    }
}
