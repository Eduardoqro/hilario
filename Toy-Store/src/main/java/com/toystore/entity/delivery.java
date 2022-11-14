package com.toystore.entity;
import java.util.Calendar;

import javax.persistence.*;
import lombok.Data;
@Entity
@Data
@Table(name="delivery")
public class delivery {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="delivery_id")
	private Long deliveryId;
	@ManyToOne
	@JoinColumn(name="order_id")
	private order orderId;
	@ManyToOne
	@JoinColumn(name="product_id")
	private product productId;
	
	@Column(name = "date", insertable=false,  updatable=false , columnDefinition = "timestamp default CURRENT_TIMESTAMP")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar createdAt;
}


