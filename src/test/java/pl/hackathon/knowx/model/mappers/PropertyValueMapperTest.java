package pl.hackathon.knowx.model.mappers;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import pl.hackathon.knowx.model.dtos.PropertyValueDto;
import pl.hackathon.knowx.model.entities.PropertyValue;

import static org.assertj.core.api.Assertions.assertThat;

class PropertyValueMapperTest {
    @Test
    void propertyValueDtoToPropertyValue() {
        //given
        PropertyValueDto expectedPV = PropertyValueDto.builder().name("nazwa").build();

        //when
        PropertyValue actualPV = PropertyValueMapper.INSTANCE.propertyValueDtoToPropertyValue(expectedPV);

        //then
        assertThat(actualPV).isNotNull();
        assertThat(actualPV.getName()).isEqualTo(expectedPV.getName());
    }
}