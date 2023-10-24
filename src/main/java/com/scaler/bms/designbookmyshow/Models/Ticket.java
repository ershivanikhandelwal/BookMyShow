package com.scaler.bms.designbookmyshow.Models;

import com.scaler.bms.bookmyshow.Enums.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tickets")
public class Ticket extends BaseModel{
    private TicketStatus Status;
    @OneToMany
    private List<Payment> Payments;
    @ManyToOne
    private User UserDetails;
    @ManyToMany
    private List<ShowSeatMapping> SeatShowDeatil= new ArrayList<>();
    private Double Amount;
    @OneToOne
    private Coupon AppliedCoupon;
}
