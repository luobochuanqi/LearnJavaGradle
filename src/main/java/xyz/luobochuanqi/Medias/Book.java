package xyz.luobochuanqi.Medias;

import com.google.gson.JsonObject;

public class Book extends Media {
    private String author;

    public Book(String isbn, String title, double price, String author) {
        super(isbn, title, price);
        this.author = author;
    }

    @Override
    public JsonObject toDoc() {
        JsonObject doc = super.toDoc();
        doc.addProperty("author", author);
        return doc;
    }
}
