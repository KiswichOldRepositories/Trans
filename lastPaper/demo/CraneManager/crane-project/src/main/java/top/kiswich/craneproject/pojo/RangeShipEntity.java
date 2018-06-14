package top.kiswich.craneproject.pojo;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class RangeShipEntity {
    private double startAngle;
    private double endAngle;
    private double startRadius;
    private double endRadius;
}
