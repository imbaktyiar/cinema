package dmdev.cinema.controllers;

import dmdev.cinema.models.dto.PriceDto;
import dmdev.cinema.service.PriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Цена")
@RestController
@RequestMapping("/api/v1/price")
public class PriceController {
    @Autowired
    private PriceService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> save(@RequestBody PriceDto priceDto){
        return new ResponseEntity<>(service.save(priceDto), HttpStatus.CREATED);
    }

    @GetMapping("/findById")
    @ApiOperation("Поиск цены по id")
    ResponseEntity<?> findById(@RequestParam Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех цен")
    ResponseEntity<List<PriceDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/delete")
    @ApiOperation("Удаление")
    ResponseEntity<?> delete(@RequestParam Long id){
        return ResponseEntity.ok(service.delete(id));
    }
}
