package bd.edu.seu.blooddonatemanagementsystemdemo.repository;

import bd.edu.seu.blooddonatemanagementsystemdemo.model.Donor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DonorRepository extends CrudRepository<Donor,Long> {
    public Donor findByName(String name);
    public List<Donor> findByAddress(String address);
    public List<Donor> findByBloodGroup(String bloodGroup);
    public Donor deleteById(long id);
}
