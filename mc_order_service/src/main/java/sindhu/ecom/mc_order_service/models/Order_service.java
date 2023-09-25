package sindhu.ecom.mc_order_service.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Order_service {
@Id
private Long id;
private String customer_name;
private Long book_id;
private String order_status;
}
