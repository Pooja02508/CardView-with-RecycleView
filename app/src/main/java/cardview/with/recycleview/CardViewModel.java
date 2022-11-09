package cardview.with.recycleview;

public class CardViewModel {
    private String name;
    private int image;

    // Constructor
    public CardViewModel(String name, int image) {
        this.name = name;
        this.image = image;
    }

    // Getter and Setter
    public String getCard_name() {
        return name;
    }

    public void setCard_name(String name) {
        this.name = name;
    }


    public int getCard_image() {
        return image;
    }

    public void setCard_image(int image) {
        this.image = image;
    }
}
