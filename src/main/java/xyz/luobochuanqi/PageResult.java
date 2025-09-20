package xyz.luobochuanqi;

import java.util.List;

public record PageResult<T>(List<T> content, int totalElements, int page, int size) {
    public int totalPages() {
        return (int) Math.ceil((double) totalElements / size);
    }
}
