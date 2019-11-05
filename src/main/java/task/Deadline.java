package task;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Deadline extends Task {

    private LocalDate date;

    /**
     * Constructor of Deadline
     * @param Description
     * @param value
     * @param date
     */
    public Deadline(String Description, int value, LocalDate date){
        super(Description, value);
        this.date = date;
    }

    /**
     * Constructor of Deadline
     * @param Description
     * @param date
     */
    public Deadline(String Description, LocalDate date, int priority){
        super(Description, 0);
        this.date = date;
        this.priority = priority;
    }

    @Override
    public String toString(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM d yyyy");
        String date = this.date.format(formatter);
        return "[D][" + getStatusIcon() + "] " + this.description + " (by: " + date + " Priority: " + priority + ")";
    }
}
