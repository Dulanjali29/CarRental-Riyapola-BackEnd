package lk.riyapola.riyapola.controller;

import lk.riyapola.riyapola.dto.AdminDto;
import lk.riyapola.riyapola.entity.Admin;
import lk.riyapola.riyapola.service.AdminService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

final AdminService adminService;
@Autowired
    public AdminController(AdminService adminService) {

    this.adminService = adminService;
    }
    @PostMapping
    public ResponseEntity<Admin> saveAdmin(@RequestBody AdminDto adminDto){
    Admin ad=adminService.saveAdmin(adminDto);
    return new ResponseEntity<>(ad, HttpStatus.CREATED);
    }
    @GetMapping
    public void getAdmin(){

    }
    @PutMapping()
    public  void updateAdmin(){

    }
    @DeleteMapping
    public  void deleteAdmin(){

    }

}
