package goit.example;

import com.google.gson.Gson;

public class App {
    public static void main(String[] args) {
        Name name = new Name("Oksana", "Molchanova");
        Gson gs = new Gson();

        System.out.println(gs.toJson(name));
    }
}

class Name {
    private final String name;
    private final String lastName;

    public Name(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

}
