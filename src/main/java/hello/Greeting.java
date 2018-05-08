package hello;

public class Greeting {

    public String getContent() {
        return content;
    }

    public int getId() {
        return id;
    }

    public Greeting( int id, String content) {
        this.content = content;
        this.id = id;
    }

    private final String content;
    private final int id;

}
