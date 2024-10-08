package _2_WorkingWIthAbstractionExercise;

public class User {

    private String name;
    private Role role;

    User(String name, Role role) {
        this.name = name;
        this.role = role;
    }

    @Override
    public String toString() {
        return String.format("Hello my name is %s, and my role is %s.",this.name, this.role);
    }
}
