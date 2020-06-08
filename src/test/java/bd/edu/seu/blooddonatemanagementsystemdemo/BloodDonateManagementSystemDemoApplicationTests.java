package bd.edu.seu.blooddonatemanagementsystemdemo;

import bd.edu.seu.blooddonatemanagementsystemdemo.model.Donor;
import bd.edu.seu.blooddonatemanagementsystemdemo.repository.DonorRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BloodDonateManagementSystemDemoApplicationTests {

    @Autowired
    private DonorRepository donorRepository;


    @Test
    void contextLoads() {
    }

    @Test
    void createDonor() {
        Donor donor = new Donor();

        donor.setId(101);
        donor.setName("Md Fahim Islam");
        donor.setAge(23);
        donor.setSex("Male");
        donor.setBloodGroup("B+");
        donor.setPhoneNumber("+08801961461966");
        donor.setAddress("flat no = x, road no : 23, South Badda, Dhaka");
        Donor donor1 = donorRepository.save(donor);
        System.out.println(donor1);

        Assertions.assertEquals(donor.getId(), donor1.getId());
        Assertions.assertEquals(donor.getName(), donor1.getName());
        Assertions.assertEquals(donor.getAge(), donor1.getAge());
        Assertions.assertEquals(donor.getSex(),donor1.getSex());
        Assertions.assertEquals(donor.getBloodGroup(),donor1.getBloodGroup());
        Assertions.assertEquals(donor.getPhoneNumber(), donor1.getPhoneNumber());
        Assertions.assertEquals(donor.getAddress(),donor1.getAddress());

        donor.setId(102);
        donor.setName("Md Murad Hossain Shuvo");
        donor.setAge(21);
        donor.setSex("Male");
        donor.setBloodGroup("O+");
        donor.setPhoneNumber("+880171254865");
        donor.setAddress("vill: sinduri Boruria, P-O: sagorkandi, Zilla: Pabna");
        Donor donor2 = donorRepository.save(donor);
        System.out.println(donor2);

        Assertions.assertEquals(donor.getId(), donor2.getId());
        Assertions.assertEquals(donor.getName(), donor2.getName());
        Assertions.assertEquals(donor.getAge(), donor2.getAge());
        Assertions.assertEquals(donor.getSex(),donor2.getSex());
        Assertions.assertEquals(donor.getBloodGroup(),donor2.getBloodGroup());
        Assertions.assertEquals(donor.getPhoneNumber(), donor2.getPhoneNumber());
        Assertions.assertEquals(donor.getAddress(),donor2.getAddress());


        donor.setId(103);
        donor.setName("Ariful Islam");
        donor.setAge(24);
        donor.setSex("Male");
        donor.setBloodGroup("AB+");
        donor.setPhoneNumber("+880184345655");
        donor.setAddress("Tonggi, Dhaka");
        Donor donor3 = donorRepository.save(donor);
        System.out.println(donor3);

        Assertions.assertEquals(donor.getId(), donor3.getId());
        Assertions.assertEquals(donor.getName(), donor3.getName());
        Assertions.assertEquals(donor.getAge(), donor3.getAge());
        Assertions.assertEquals(donor.getSex(),donor3.getSex());
        Assertions.assertEquals(donor.getBloodGroup(),donor3.getBloodGroup());
        Assertions.assertEquals(donor.getPhoneNumber(), donor3.getPhoneNumber());
        Assertions.assertEquals(donor.getAddress(),donor3.getAddress());


        donor.setId(104);
        donor.setName("Sharin Maria");
        donor.setAge(24);
        donor.setSex("Female");
        donor.setBloodGroup("B-");
        donor.setPhoneNumber("+880171252452");
        donor.setAddress("kauarchor, Barisal");
        Donor donor4 = donorRepository.save(donor);
        System.out.println(donor4);

        Assertions.assertEquals(donor.getId(), donor4.getId());
        Assertions.assertEquals(donor.getName(), donor4.getName());
        Assertions.assertEquals(donor.getAge(), donor4.getAge());
        Assertions.assertEquals(donor.getSex(),donor4.getSex());
        Assertions.assertEquals(donor.getBloodGroup(),donor4.getBloodGroup());
        Assertions.assertEquals(donor.getPhoneNumber(), donor4.getPhoneNumber());
        Assertions.assertEquals(donor.getAddress(),donor4.getAddress());


        donor.setId(105);
        donor.setName("Shabik Shuvo");
        donor.setAge(24);
        donor.setSex("Male");
        donor.setBloodGroup("O+");
        donor.setPhoneNumber("+880171254653");
        donor.setAddress("Mataikata, Dhaka");
        Donor donor5 = donorRepository.save(donor);
        System.out.println(donor5);

        Assertions.assertEquals(donor.getId(), donor5.getId());
        Assertions.assertEquals(donor.getName(), donor5.getName());
        Assertions.assertEquals(donor.getAge(), donor5.getAge());
        Assertions.assertEquals(donor.getSex(),donor5.getSex());
        Assertions.assertEquals(donor.getBloodGroup(),donor5.getBloodGroup());
        Assertions.assertEquals(donor.getPhoneNumber(), donor5.getPhoneNumber());
        Assertions.assertEquals(donor.getAddress(),donor5.getAddress());

    }
}