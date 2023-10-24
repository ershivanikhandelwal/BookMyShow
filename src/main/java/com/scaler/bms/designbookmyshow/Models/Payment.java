package com.scaler.bms.designbookmyshow.Models;

import com.scaler.bms.bookmyshow.Enums.PaymentMode;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="payments")
public class Payment extends BaseModel{
    private long ReferenceNumber;
    @Enumerated
    private PaymentMode Mode;
    private Double PaymentAmount;
}
