package pl.hackathon.knowx.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.hackathon.knowx.model.dtos.PropertyValueDto;
import pl.hackathon.knowx.model.entities.PropertyValue;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PropertyValueMapper {
    PropertyValueMapper INSTANCE = Mappers.getMapper(PropertyValueMapper.class);

    PropertyValueDto propertyValueToPropertyValueDto(PropertyValue propertyValue);
    PropertyValue propertyValueDtoToPropertyValue(PropertyValueDto propertyValueDto);
    List<PropertyValueDto> propertyValueListToPropertyValueListDto(List<PropertyValue> propertyValues);
}
