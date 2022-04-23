package pl.hackathon.knowx.services;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.dtos.PropertyDto;
import pl.hackathon.knowx.model.entities.Property;
import pl.hackathon.knowx.model.mappers.PropertyMapper;
import pl.hackathon.knowx.model.repositories.PropertyRepository;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PropertyService {
    private final PropertyRepository propertyRepository;

    public Property createProperty(PropertyDto propertyDto) {
        return propertyRepository.save(PropertyMapper.INSTANCE.propertyDtoToProperty(propertyDto));
    }

    public Optional<Property> getProperty(Long id) {
        return propertyRepository.findById(id);
    }

    public Optional<List<Property>> getAllProperties(){
        return Optional.of(propertyRepository.findAll());
    }

    public void deleteProperty(Long id) {
        propertyRepository.deleteById(id);
    }
}
