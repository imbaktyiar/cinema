package dmdev.cinema.service.impl;

import dmdev.cinema.dao.CinemaRepo;
import dmdev.cinema.mappers.CinemaMapper;
import dmdev.cinema.models.dto.CinemaDto;
import dmdev.cinema.models.request.SaveCinemaRequest;
import dmdev.cinema.service.CinemaService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CinemaServiceImpl implements CinemaService {

    CinemaMapper mapper = CinemaMapper.INSTANCE;
    private  final CinemaRepo cinemaRepo;

    public CinemaServiceImpl(CinemaRepo cinemaRepo) {
        this.cinemaRepo = cinemaRepo;
    }

    @Override
    public CinemaDto save(CinemaDto t) {
        return null;
    }

    @Override
    public CinemaDto findById(Long id) {
        return null;
    }

    @Override
    public CinemaDto delete(Long id) {
        return null;
    }

    @Override
    public List<CinemaDto> findAll() {
        return null;
    }

    @Override
    public CinemaDto create(SaveCinemaRequest cinema) {
        CinemaDto cinemaDto = new CinemaDto();
        cinemaDto.setName(cinema.getName());
        cinemaDto.setAddress(cinema.getAddress());
        cinemaDto.setLogo(cinema.getLogo());
        return save(cinemaDto);
    }

    @Override
    public List<CinemaDto> findCinemaByRoomId(Long roomId) {
        return mapper.toDtos(cinemaRepo.findCinemaByRoomId(roomId));
    }
}
