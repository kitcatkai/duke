public class Task {
    protected String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    public String getStatusIcon() {
        return (isDone ? "\u2705" : "\u2718"); //return tick or X symbols
    }

    public void setIsDone(){
        this.isDone = true;
    }


}
