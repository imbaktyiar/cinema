package dmdev.cinema.controllers;

import dmdev.cinema.models.dto.MovieDto;
import dmdev.cinema.service.MovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Api(tags = "Фильм")
@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {
    @Autowired
    private MovieService service;

    @PostMapping("/save")
    @ApiOperation("Сохранение")
    ResponseEntity<?> save(@RequestBody MovieDto movieDto) {
        return new ResponseEntity<>(service.save(movieDto), HttpStatus.CREATED);
    }

    @GetMapping("/findById")
    @ApiOperation("Поиск фильм по id")
    ResponseEntity<?> findById(@RequestParam Long id) {
        return ResponseEntity.ok(service.findById(id));
    }

    @GetMapping("/findAll")
    @ApiOperation("Вывод всех фильмов")
    ResponseEntity<List<MovieDto>> findAll() {
        return ResponseEntity.ok(service.findAll());
    }

    @DeleteMapping("/delete")
    @ApiOperation("Удаление")
    ResponseEntity<?> delete(@RequestParam Long id) {
        return ResponseEntity.ok(service.delete(id));
    }

}
