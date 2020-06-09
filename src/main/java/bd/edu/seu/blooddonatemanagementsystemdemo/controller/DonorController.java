package bd.edu.seu.blooddonatemanagementsystemdemo.controller;

import bd.edu.seu.blooddonatemanagementsystemdemo.exception.ResourceAlreadyExitsException;
import bd.edu.seu.blooddonatemanagementsystemdemo.exception.ResourceNotFoundException;
import bd.edu.seu.blooddonatemanagementsystemdemo.model.Donor;
import bd.edu.seu.blooddonatemanagementsystemdemo.service.DonorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/donors")
public class DonorController {
    private DonorService donorService;

    public DonorController(DonorService donorService) {
        this.donorService = donorService;
    }

    @PostMapping(value = "/create")
    public ResponseEntity<Donor> createDonor(@RequestBody Donor donor) {
        try {
            Donor createDonor = donorService.createDonor(donor);
            return ResponseEntity.status(HttpStatus.CREATED).body(createDonor);
        } catch (ResourceAlreadyExitsException e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping("")
    public ResponseEntity<List<Donor>> getDonors() {
        List<Donor> Alldonor = donorService.findAll();
        return ResponseEntity.ok(Alldonor);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Donor> getDonorById(@PathVariable long id) {
        try {
            Donor donorbyid = donorService.findByid(id);
            return ResponseEntity.ok(donorbyid);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping(value = "/{address}")
    public ResponseEntity<List<Donor>> getDonoyByAddress(@PathVariable String address) {
        try {
            List<Donor> byAddress = donorService.findByAddress(address);
            return ResponseEntity.ok(byAddress);
        } catch (ResourceNotFoundException e) {
            return ResponseEntity.notFound().build();
        }
    }


}
