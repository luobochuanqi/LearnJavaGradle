package xyz.luobochuanqi.Medias;

import com.google.gson.JsonObject;
import xyz.luobochuanqi.Storable;

public class Media implements Storable<Media> {
    protected String isbn;
    protected String title;
    protected double price;

    public Media(String isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    @Override
    public JsonObject toDoc() {
        JsonObject doc = new JsonObject();
        doc.addProperty("isbn", isbn);
        doc.addProperty("title", title);
        doc.addProperty("price", price);
        return doc;
    }
}
