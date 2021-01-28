package eu.prusaczyk.chat;

public class Image {

    private String value;
    private String user;
    private String image;

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Image(String value) {
        this.value = value;
    }

    public Image() {
    }
}
