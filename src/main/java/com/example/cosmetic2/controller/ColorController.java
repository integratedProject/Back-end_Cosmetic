package com.example.cosmetic2.controller;

import com.example.cosmetic2.model.Color;
import com.example.cosmetic2.service.ColorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ColorController {
    @Autowired
    ColorService colorService;

    @GetMapping("/color")
    public List<Color> getAllColor(){
        return colorService.getAllColor();
    }

    @DeleteMapping("/color/{id}")
    public void deleteColor(@PathVariable String id){
        colorService.deleteColor(id);
    }
}
