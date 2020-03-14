package mobi.com.multiselect.model;

public class Inbox {

    public int id;
    public int image = 0;
    public String from;
    public String email;
    public String message;
    public String date;
    public int color = -1;


    public Inbox(int id, int image, String from, String email, String message, String date, int color) {
        this.id = id;
        this.image = image;
        this.from = from;
        this.email = email;
        this.message = message;
        this.date = date;
        this.color = color;
    }
}