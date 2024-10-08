package _2_WorkingWIthAbstractionExercise;

public enum Role {

    ADMIN(true),
    SUPPORT(false),
    USER(false);

    private boolean isAccessAllowed;

    Role(boolean isAccessAllowed){
        this.isAccessAllowed = isAccessAllowed;
    }

    public boolean isAccessAllowed(){
        return this.isAccessAllowed;
    }
}
