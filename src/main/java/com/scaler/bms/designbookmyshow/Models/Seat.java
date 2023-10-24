package com.scaler.bms.designbookmyshow.Models;

import com.scaler.bms.bookmyshow.Enums.SeatType;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
public class Seat extends BaseModel{
    private long RowNumber;
    private long ColumnNumber;
    @Enumerated
    private SeatType Type;
}
