package xyz.luobochuanqi.Medias;

import com.google.gson.JsonObject;

public class Magazine extends Media {
    private String author;
    private int issue;

    public Magazine(String isbn, String title, double price, String author, int issue) {
        super(isbn, title, price);
        this.author = author;
        this.issue = issue;
    }

    @Override
    public JsonObject toDoc() {
        JsonObject doc = super.toDoc();
        doc.addProperty("author", author);
        doc.addProperty("issue", issue);
        return doc;
    }
}
