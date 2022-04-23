package pl.hackathon.knowx.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.dtos.PropertyValueDto;
import pl.hackathon.knowx.model.entities.PropertyValue;
import pl.hackathon.knowx.model.mappers.PropertyValueMapper;
import pl.hackathon.knowx.model.repositories.PropertyValueRepository;

import java.util.Optional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PropertyValueService {
    private final PropertyValueRepository propertyValueRepository;

    public PropertyValue createPropertyValue(PropertyValueDto propertyValueDto) {
        return propertyValueRepository
                .save(PropertyValueMapper.INSTANCE.propertyValueDtoToPropertyValue(propertyValueDto));
    }

    public Optional<PropertyValue> getPropertyValue(Long id) {
        return propertyValueRepository.findById(id);
    }

    public Optional<List<PropertyValue>> getAllPropertyValues() {
        return Optional.of(propertyValueRepository.findAll());
    }

    public void deletePropertyValue(Long id){
        propertyValueRepository.deleteById(id);
    }
}
