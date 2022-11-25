public class Student {
    int id;
    public String name;
    int age;
    String gender;
    String batch;

    void changeBatch(String st) {
        batch = st;
    }

    void takePause() {
        batch = null;
    }
}
