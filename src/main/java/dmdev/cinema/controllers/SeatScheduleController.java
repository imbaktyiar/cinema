package dmdev.cinema.controllers;

import dmdev.cinema.models.dto.SeatScheduleDto;
import dmdev.cinema.models.entities.SeatSchedule;
import dmdev.cinema.service.SeatScheduleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Расписание мест")
@RestController
@RequestMapping("/api/v1/seatSchedule")
public class SeatScheduleController {
    @Autowired
    private SeatScheduleService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> save(@RequestBody SeatScheduleDto seatScheduleDto){
        return new ResponseEntity<>(service.save(seatScheduleDto), HttpStatus.CREATED);
    }

    @GetMapping("/findById")
    @ApiOperation("Поиск по id")
    ResponseEntity<?> findById(@RequestParam Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех seatSchedule")
    ResponseEntity<List<SeatScheduleDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/delete")
    @ApiOperation("Удаление")
    ResponseEntity<?> delete(@RequestParam Long id){
        return ResponseEntity.ok(service.delete(id));
    }
}
