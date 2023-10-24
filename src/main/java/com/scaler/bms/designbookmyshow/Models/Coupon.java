package com.scaler.bms.designbookmyshow.Models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="Coupons")
public class Coupon extends BaseModel{
    private String CouponCode;
}
