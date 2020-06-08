package bd.edu.seu.blooddonatemanagementsystemdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Blood {
    private String bloodType;
    private int cost;
    @Id
    private String code;

}
