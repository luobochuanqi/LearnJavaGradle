package xyz.luobochuanqi;

import com.google.gson.JsonObject;

public interface Storable<T> {
    JsonObject toDoc();
}
