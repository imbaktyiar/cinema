package dmdev.cinema.controllers;

import dmdev.cinema.models.dto.OrderDto;
import dmdev.cinema.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Заказ")
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {
    @Autowired
    private OrderService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> save(@RequestBody OrderDto orderDto){
        return new ResponseEntity<>(service.save(orderDto),HttpStatus.CREATED);
    }

    @GetMapping("/findById")
    @ApiOperation("Поиск заказов по id")
    ResponseEntity<?> findById(@RequestParam Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех заказов")
    ResponseEntity<List<OrderDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }
    @DeleteMapping("/delete")
    @ApiOperation("Удаление")
    ResponseEntity<?> delete(@RequestParam Long id){
        return ResponseEntity.ok(service.delete(id));
    }
}
