package pl.hackathon.knowx.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.dtos.PropertyKeyDto;
import pl.hackathon.knowx.model.entities.PropertyKey;
import pl.hackathon.knowx.model.mappers.PropertyKeyMapper;
import pl.hackathon.knowx.model.repositories.PropertyKeyRepository;

import java.util.Optional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class PropertyKeyService {
    private final PropertyKeyRepository propertyKeyRepository;

    public PropertyKey createPropertyKey(PropertyKeyDto propertyKeyDto) {
        return propertyKeyRepository
                .save(PropertyKeyMapper.INSTANCE.propertyKeyDtoToPropertyKey(propertyKeyDto));
    }
    
    public Optional<PropertyKey> getPropertyKey(Long id) {
        return propertyKeyRepository.findById(id);
    }

    public Optional<List<PropertyKey>> getAllPropertyKeys() {
        return Optional.of(propertyKeyRepository.findAll());
    }

    public void deletePropertyKey(Long id){
        propertyKeyRepository.deleteById(id);
    }
}
