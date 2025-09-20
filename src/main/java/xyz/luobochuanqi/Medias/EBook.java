package xyz.luobochuanqi.Medias;

import com.google.gson.JsonObject;

public class EBook extends Media {
    private String author;
    private String downloadUrl;

    public EBook(String isbn, String title, double price, String author, String downloadUrl) {
        super(isbn, title, price);
        this.author = author;
        this.downloadUrl = downloadUrl;
    }

    @Override
    public JsonObject toDoc() {
        JsonObject doc = super.toDoc();
        doc.addProperty("author", author);
        doc.addProperty("downloadUrl", downloadUrl);
        return doc;
    }
}
