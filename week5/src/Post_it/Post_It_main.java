package Post_it;

public class Post_It_main {
    public static void main(String[] args) {
        PostIt one=new PostIt("narancssárga","Ötlet1","kék");
        PostIt two=new PostIt("rózsaszin","Csodálatos","fekete");
        PostIt three=new PostIt("citromsárga","Fenséges","zöld");
        one.write();
        two.write();
        three.write();

        }

}

