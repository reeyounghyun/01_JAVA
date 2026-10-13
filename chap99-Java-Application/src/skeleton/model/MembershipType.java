package skeleton.model;

public enum MembershipType {

    DAILY("일일", 1),
    MONTHLY("월간", 30),
    YEARLY("연간", 365);

    private final String description;
    private final int days;

    MembershipType(String description, int days) {
        this.description = description;
        this.days = days;
    }

    public String getDescription() {
        return description;
    }

    public int getDays() {
        return days;
    }
}
