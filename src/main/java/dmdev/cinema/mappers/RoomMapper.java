package dmdev.cinema.mappers;

import dmdev.cinema.models.dto.RoomDto;
import dmdev.cinema.models.entities.Room;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RoomMapper extends BaseMapper<Room, RoomDto>{
    RoomMapper INSTANCE = Mappers.getMapper(RoomMapper.class);
}
