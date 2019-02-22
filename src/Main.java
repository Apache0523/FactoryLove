public class Main {

    public static void main(String[] args) {
        MyLove myLove = LoveFactory.Test();
        myLove.getMessage();
        myLove = LoveFactory.TestU();
        myLove.getMessage();

    }
}
