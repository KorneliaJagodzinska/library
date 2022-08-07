package library;

import lombok.Value;

@Value(staticConstructor = "of")
public class Book {
    String title;
    String author;
    int year;
}
