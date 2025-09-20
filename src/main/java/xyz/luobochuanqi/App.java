package xyz.luobochuanqi;

import xyz.luobochuanqi.Medias.Book;

public class App {
    public static void main(String[] args) {
        Warehouse<Book> bookWarehouse = new Warehouse<>();

        bookWarehouse.add(new Book("123", "Java 编程", 59.9, "张三"));
        bookWarehouse.add(new Book("124", "Spring 实战", 69.9, "李四"));
        bookWarehouse.add(new Book("125", "并发艺术", 79.9, "王五"));

        var result = bookWarehouse.query(b -> true, 0, 2);

        System.out.println("总条数: " + result.totalElements());
        System.out.println("总页数: " + result.totalPages());
        System.out.println("当前页内容:");
        result.content().forEach(book -> System.out.println(book.toDoc()));
    }
}
