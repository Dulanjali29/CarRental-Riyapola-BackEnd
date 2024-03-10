package lk.riyapola.riyapola.service;

import lk.riyapola.riyapola.dto.AdminDto;
import lk.riyapola.riyapola.entity.Admin;
import lk.riyapola.riyapola.repo.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class AdminService {
    final AdminRepo adminRepo;
    @Autowired
    public AdminService(AdminRepo adminRepo) {

        this.adminRepo = adminRepo;
    }
    public Admin saveAdmin(AdminDto adminDto){
        String encodePassword= Base64.getEncoder().encodeToString(adminDto.getPassword().getBytes());
        Admin saved=adminRepo.save(new Admin(adminDto.getFirstName(), adminDto.getLastName(), adminDto.getUserName(), encodePassword, adminDto.getRole()));
        return  saved;
    }
    public void getAllAdmin(){

    }
    public void updateAdmin(){

    }
    public  void searchAdmin(){

    }
}
