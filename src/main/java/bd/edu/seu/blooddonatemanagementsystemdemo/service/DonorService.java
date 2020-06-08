package bd.edu.seu.blooddonatemanagementsystemdemo.service;

import bd.edu.seu.blooddonatemanagementsystemdemo.exception.ResourceAlreadyExitsException;
import bd.edu.seu.blooddonatemanagementsystemdemo.exception.ResourceNotFoundException;
import bd.edu.seu.blooddonatemanagementsystemdemo.model.Donor;
import bd.edu.seu.blooddonatemanagementsystemdemo.repository.DonorRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DonorService {
    private DonorRepository donorRepository;

    public DonorService(DonorRepository donorRepository) {
        this.donorRepository = donorRepository;
    }

    public Donor createDonor(Donor donor) throws ResourceAlreadyExitsException {
        if (donorRepository.existsById(donor.getId())){
            throw new ResourceAlreadyExitsException();
        } else {
            Donor saveDonor = donorRepository.save(donor);
            return saveDonor;
        }
    }

    public List<Donor> findAll(){
        List<Donor> donorList = new ArrayList<>();
        donorRepository.findAll().forEach(donorList::add);
        return donorList;
    }

    public Donor findByid(long id) throws ResourceNotFoundException{
        Donor donor = donorRepository.findById(id).orElseThrow(ResourceNotFoundException::new);
        return donor;
    }

    public Donor findDonorByName(String name) throws ResourceNotFoundException{
        Donor byName = donorRepository.findByName(name);
        return byName;
    }

    public List<Donor> findByAddress(String address) throws ResourceNotFoundException{
        List<Donor> donorByAddress = donorRepository.findByAddress(address);
        return donorByAddress;


    }
    public List<Donor> findByGroupName(String bloodGroup){
        List<Donor> byBloodGroup = donorRepository.findByBloodGroup(bloodGroup);
        return byBloodGroup;
    }


}
