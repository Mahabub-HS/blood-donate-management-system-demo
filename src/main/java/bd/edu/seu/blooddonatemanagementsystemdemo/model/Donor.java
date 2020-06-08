package bd.edu.seu.blooddonatemanagementsystemdemo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.tomcat.jni.Address;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Donor {
    @Id
    private long id;
    private String name;
    private int age;
    private String sex;
    private String  address;
    private String phoneNumber;
    private String bloodGroup;

}
