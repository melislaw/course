package pl.kkiljan.lesson16;

/*
Zaimplementuj klasę HtmlTag, która będzie menadżerem kontekstu. W konstruktorze powinna przyjmować nazwę znacznika np. em. Klasa powinna mieć metodę body, która przyjmie parametr typu String i wypisze go na konsoli.
 */


public class HtmlTag implements AutoCloseable {

    private final String tag;

    public HtmlTag(String tag) {
        this.tag = tag;
        System.out.println("<" + tag +">");
    }

    public void body(String text) {

        System.out.println(text);

    }


    @Override
    public void close() {
        System.out.println("</" + tag +">");

    }


    public static void main(String[] args) {

        try (
                HtmlTag h1 = new HtmlTag("h1");
                HtmlTag em = new HtmlTag("em");
                )
        {
            em.body("tekst otoczony znacznikami");
        }

    }
}
