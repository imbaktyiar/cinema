package dmdev.cinema.service;

import dmdev.cinema.models.dto.CinemaDto;
import dmdev.cinema.models.request.SaveCinemaRequest;

import java.util.List;

public interface CinemaService extends BaseService<CinemaDto> {
    CinemaDto create(SaveCinemaRequest cinema);
    List<CinemaDto> findCinemaByRoomId(Long roomId);
}
