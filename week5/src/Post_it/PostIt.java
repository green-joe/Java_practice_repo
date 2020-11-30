package Post_it;

public class PostIt {
    String backgroundColor;
    String text;
    String textColor;

    public PostIt(String backgroundColor, String text, String textColor) {
        this.backgroundColor = backgroundColor;
        this.text = text;
        this.textColor = textColor;
    }
    public void write(){
        System.out.println("A jegyzet szövege: "+text+"\n " +
                "szine:"+textColor+"\n háttérszine: "+backgroundColor);
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }
}
