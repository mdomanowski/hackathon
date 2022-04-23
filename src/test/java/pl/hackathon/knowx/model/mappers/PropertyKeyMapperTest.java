package pl.hackathon.knowx.model.mappers;

import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.Test;
import pl.hackathon.knowx.model.dtos.PropertyKeyDto;
import pl.hackathon.knowx.model.dtos.PropertyValueDto;
import pl.hackathon.knowx.model.entities.PropertyKey;
import pl.hackathon.knowx.model.entities.PropertyValue;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.Set;
import java.util.List;

class PropertyKeyMapperTest {

    @Test
    void propertyKeyDtoToPropertyKey() {
        //given
        PropertyKeyDto expectedPK = PropertyKeyDto.builder()
                .name("nazwa")
                .propertyValues(
                        Set.of(PropertyValueDto.builder().name("kawa").build(),
                                PropertyValueDto.builder().name("jest").build()))
                .build();

        //when
        PropertyKey actualPK = PropertyKeyMapper.INSTANCE.propertyKeyDtoToPropertyKey(expectedPK);

        //then
        assertThat(actualPK).isNotNull();
        assertThat(actualPK.getName()).isEqualTo(expectedPK.getName());

        List<PropertyValueDto> expectedListOfPV = new ArrayList<>(expectedPK.getPropertyValues());
        List<PropertyValue> actualListOfPV = new ArrayList<>(actualPK.getPropertyValues());

        for(int i=0; i < actualListOfPV.size();i++){
            PropertyValueDto expectedPV = expectedListOfPV.get(i);
            PropertyValue actualPV = actualListOfPV.get(i);

            assertThat(actualPV).isNotNull();
            assertThat(actualPV.getName()).isEqualTo(expectedPV.getName());
        }
    }
}