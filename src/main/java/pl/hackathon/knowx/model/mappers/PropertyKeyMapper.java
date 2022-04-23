package pl.hackathon.knowx.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.hackathon.knowx.model.dtos.PropertyKeyDto;
import pl.hackathon.knowx.model.entities.PropertyKey;

import java.util.List;

@Mapper(componentModel = "spring", uses = {PropertyKeyMapper.class})
public interface PropertyKeyMapper {
    PropertyKeyMapper INSTANCE = Mappers.getMapper(PropertyKeyMapper.class);

    PropertyKeyDto propertyKeyToPropertyKeyDto(PropertyKey propertyKey);
    PropertyKey propertyKeyDtoToPropertyKey(PropertyKeyDto propertyKeyDto);
    List<PropertyKeyDto> propertyKeyListToPropertyKeyListDto(List<PropertyKey> propertyKeys);
}
