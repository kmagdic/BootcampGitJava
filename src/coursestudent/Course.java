package coursestudent;

import java.util.Objects;

public class Course {
    String name;
    int durationInDays;
    boolean started;

    public void setName(String name) {
        this.name = name;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public Course(String name, int durationInDays, boolean started) {
        this.name = name;
        this.durationInDays = durationInDays;
        this.started = started;
    }


    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", durationInDays=" + durationInDays +
                ", started=" + started +
                '}';
    }
}
