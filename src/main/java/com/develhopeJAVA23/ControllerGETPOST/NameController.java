package com.develhopeJAVA23.ControllerGETPOST;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {
    @GetMapping("/getcall")
    public String getName (@RequestParam String name){
        return name;
    }

    @PostMapping("/postcall")
    public StringBuilder postName (@RequestParam StringBuilder name){
        return name.reverse();
    }
}
