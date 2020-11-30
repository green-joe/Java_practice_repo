package Post_it;

public class BlogPost {
    String authorName;
    String title;
    String text;
    String publicationDate;

    public BlogPost(String authorName, String title, String text, String publicationDate) {
        this.authorName = authorName;
        this.title = title;
        this.text = text;
        this.publicationDate = publicationDate;
    }
    public void writeBlog(){
        System.out.println("A szerző neve: "+authorName+"\n " +
                "a mű címe:"+title+"\n a mű szövege: "+text+" \na kiadás dátuma:"+publicationDate);
    }
}
