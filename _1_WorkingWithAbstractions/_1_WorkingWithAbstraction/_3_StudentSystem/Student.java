package _1_WorkingWithAbstraction._3_StudentSystem;

public record Student(String name, int age, double grade) {

    @Override
    public String toString() {

        return String.format("%s is %s years old. %s", name, age, getPostFix());
    }

    private String getPostFix() {
        String postFix = "Very nice person.";

        if (grade() >= 5.00) {
            postFix = "Excellent student.";
        } else if (grade() >= 3.50) {
            postFix = "Average student.";
        }
        return postFix;
    }
}
