package pl.hackathon.knowx.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.hackathon.knowx.model.dtos.PropertyDto;
import pl.hackathon.knowx.model.entities.Property;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PropertyMapper {
    PropertyMapper INSTANCE = Mappers.getMapper(PropertyMapper.class);

    Property propertyDtoToProperty(PropertyDto propertyDto);
    PropertyDto propertyToPropertyDto(Property property);
    List<Property> propertyListDtoToPropertyList(List<PropertyDto> propertiesDto);
    List<PropertyDto> propertyListToPropertyListDto(List<Property> properties);
}
