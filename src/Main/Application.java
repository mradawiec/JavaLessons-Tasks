package Main;

public class Application {
    String name;
    String version;
    Double value;

    public Application(String name, String version, double value) {
        this.name = name;
        this.version = version;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

    public Double getValue() {
        return value;
    }
}
