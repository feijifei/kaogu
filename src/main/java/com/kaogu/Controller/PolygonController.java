package com.kaogu.Controller;

import com.kaogu.Bean.Polygon;
import com.kaogu.Mapper.PolygonMapper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PolygonController {

    @Autowired
    PolygonMapper polygonMapper;

    @GetMapping("/polygon/{id}")
    public String getPolygon(Model model, @PathVariable("id") Integer id){
        Polygon polygon = polygonMapper.getPLYById(id);
        model.addAttribute("polygon", polygon);
        return "dynamic_ply";
    }

    @ResponseBody
    @GetMapping("/ply/{id}")
    public Polygon getpolygon(@PathVariable("id") Integer id) {
        Polygon polygon = polygonMapper.getPLYById(id);
        return polygon;
    }

    @GetMapping("/success")
    public String success() {
        return "success";
    }
}
