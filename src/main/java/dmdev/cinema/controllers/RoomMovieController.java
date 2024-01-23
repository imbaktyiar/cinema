package dmdev.cinema.controllers;

import dmdev.cinema.models.dto.RoomMovieDto;
import dmdev.cinema.service.RoomMovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Сеанс")
@RestController
@RequestMapping("/api/v1/roomMovie")
public class RoomMovieController {
    @Autowired
    private RoomMovieService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> save(@RequestBody RoomMovieDto roomMovieDto){
        return new ResponseEntity<>(service.save(roomMovieDto), HttpStatus.CREATED);
    }

    @GetMapping("/findById")
    @ApiOperation("Поиск по id")
    ResponseEntity<?> findById(@RequestParam Long id){
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех сеансов")
    ResponseEntity<List<RoomMovieDto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/delete")
    @ApiOperation("У даление")
    ResponseEntity<?> delete(@RequestParam Long id){
        return ResponseEntity.ok(service.delete(id));
    }
}
