package com.DoDucMinhQuang.e_commerce_system.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
public class OrdersEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", columnDefinition = "BIGINT")
    Long id;

    @Column(name = "IDORDERS", columnDefinition = "CHAR(10)")
    String idOrders;

    @Column(name = "ORDERS_DATE", columnDefinition = "DATETIME")
    LocalDateTime ordersDate;

    @Column(name = "IDCUSTOMER", columnDefinition = "BIGINT")
    Long idCustomer;

    @Column(name = "IDPAYMENT", columnDefinition = "BIGINT")
    Long idPayment;

    @Column(name = "IDTRANSPORT", columnDefinition = "BIGINT")
    Long idTransport;

    @Column(name = "TOTAL_MONEY", columnDefinition = "DECIMAL")
    BigDecimal totalMoney;

    @Column(name = "NOTES", columnDefinition = "NVARCHAR(MAX)")
    String notes;

    @Column(name = "NAME_RECEIVER", columnDefinition = "NVARCHAR(250)")
    String nameReceiver;

    @Column(name = "ADDRESS", columnDefinition = "NVARCHAR(500)")
    String address;

    @Column(name = "EMAIL", columnDefinition = "NVARCHAR(150)")
    String email;

    @Column(name = "PHONE", columnDefinition = "NVARCHAR(50)")
    String phone;

    @Column(name = "ISDELETE", columnDefinition = "TINYINT DEFAULT 0")
    Byte isDelete;

    @Column(name = "ISACTIVE", columnDefinition = "TINYINT DEFAULT 1")
    Byte isActive;
}
