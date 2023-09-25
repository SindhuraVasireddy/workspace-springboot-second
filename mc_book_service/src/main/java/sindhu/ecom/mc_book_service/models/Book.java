package sindhu.ecom.mc_book_service.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Book {
 @Id
 private Long id;
 private String title;
 private String author;
 private Long price;  
}
