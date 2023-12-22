package tech.reliab.course.Ngindu_lab.bank.enums;

public enum JobName {
    MANAGER,
    ADVISOR,
    PROGRAMMER;

    public static JobName getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }
}