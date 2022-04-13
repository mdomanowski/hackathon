package pl.hackathon.knowx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.dtos.PropertyValueDto;
import pl.hackathon.knowx.mappers.PropertyValueMapper;
import pl.hackathon.knowx.model.PropertiesList;
import pl.hackathon.knowx.model.PropertyValue;
import pl.hackathon.knowx.repositories.PropertyValueRepository;

import java.util.Optional;

@Service
public class PropertyValueService {

    private PropertyValueRepository propertyValueRepository;

    @Autowired
    public PropertyValueService(PropertyValueRepository propertyValueRepository) {
        this.propertyValueRepository = propertyValueRepository;
    }

    public PropertyValue createPropertyValue(PropertyValueDto propertyValueDto) {
        return propertyValueRepository.save(PropertyValueMapper.propertyValueDtoToPropertyValue(propertyValueDto));
    }

    public Optional<PropertyValue> getPropertyValue(Long id) {
        Optional<PropertyValue> pV = propertyValueRepository.findById(id);
        return pV;
    }
}