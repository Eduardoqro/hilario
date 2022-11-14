package com.toystore.entity;

import java.util.Calendar;

import javax.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="shopping_order")
public class order {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="order_id")
	private Long orderId;
	@ManyToOne //para  ser la relacion con otra tabla de uno a muchos
	@JoinColumn(name="customer_id")
	private Customer costumerId;
	@Column(name = "date", insertable=false,  updatable=false , columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdAt;
}
