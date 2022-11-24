package entities;

import entitiesEnums.OrderStatus;
import java.util.Date;


//Criação da classe pedido 
public class Order {
    private Integer id;
    private java.util.Date moment;
    private OrderStatus status;

//Criação do construtor pedido com argumentos
    public Order(Integer id, Date moment, OrderStatus status) {
         this.id = id;
         this.moment = moment;
         this.status = status;
    }

//Geração de getters e setters
public Integer getId() {
    return id;
}

public void setId(Integer id){
    this.id = id;
}

public Date getMoment() {
    return moment;
}

public void setMoment(Date moment) {
    this.moment = moment;
}

public OrderStatus getStatus() {
    return status;
}

public void setStatus(OrderStatus status){
this.status = status;

}

//Geração do toString 
public String toString() {
    return "Order [id=" + id + ", moment=" + moment + ", status=" + status + "]";
}
}
