class Book{
    String title;
    String author;
    String lesson;
    int price;
    int page;

    void bookTitle(){
        System.out.println(title);
    }
    void bookAuthor(){
        System.out.println(author);
    }
    void bookLesson(){
        System.out.println();
        System.out.println(lesson);
    }
    int bookPrice(){
        return price;
    }
    int bookPage(){
        return page;
    }
}

public class App5{
    public static void main(String args[]){
        Book b1=new Book();

        b1.title="Thinking, Fast and Slow";
        b1.author="Daniel Kahneman";
        b1.page=499;
        b1.price=1001;
        b1.lesson="Two Systems: The brain uses System 1 (fast, emotional, automatic) and System 2 (slow, logical, effortful) to make every decision.Cognitive Biases: Humans constantly fall victim to mental shortcuts, like assuming a good-looking person is also intelligent.Loss Aversion: People fear losing something twice as much as they enjoy gaining the exact same thing.Overconfidence: We consistently overestimate how well we understand the world and underestimate the role of pure chance.";

        b1.bookTitle();
        b1.bookAuthor();
        b1.bookLesson();
        System.out.println("The page of book: "+b1.bookPage());
        System.out.println("The price of book: "+b1.bookPrice());







    }
}