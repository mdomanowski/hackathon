package pl.hackathon.knowx.mappers;

import org.modelmapper.ModelMapper;
import pl.hackathon.knowx.dtos.PropertyValueDto;
import pl.hackathon.knowx.model.PropertyValue;

public class PropertyValueMapper {
    private static final ModelMapper modelMapper = new ModelMapper();

    public static PropertyValueDto propertyValueToPropertyValueDto(PropertyValue propertyValue){
        return modelMapper.map(propertyValue, PropertyValueDto.class);
    }

    public static PropertyValue propertyValueDtoToPropertyValue(PropertyValueDto propertyValueDto){
        return modelMapper.map(propertyValueDto, PropertyValue.class);
    }


}
