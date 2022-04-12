package pl.hackathon.knowx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.Flashcard;
import pl.hackathon.knowx.model.PropertyNameValue;
import pl.hackathon.knowx.repositories.FlashcardRepository;
import pl.hackathon.knowx.repositories.PropertyNameValueRepository;

import java.util.Optional;

@Service
public class PropertyNameValueService {
    private PropertyNameValueRepository propertyNameValueRepository;
    private FlashcardRepository flashcardRepository;

    @Autowired
    public PropertyNameValueService(PropertyNameValueRepository propertyNameValueRepository, FlashcardRepository flashcardRepository) {
        this.propertyNameValueRepository = propertyNameValueRepository;
        this.flashcardRepository = flashcardRepository;
    }

    public PropertyNameValue createPropertyNameValue(String name, String value, Flashcard flashcard) {
        return propertyNameValueRepository.save(new PropertyNameValue(name, value, flashcard));
    }

    public Optional<PropertyNameValue> getPropertyNameValue(Long id) {
        return propertyNameValueRepository.findById(id);
    }

    public void deleteTag(Long id) {
        propertyNameValueRepository.deleteById(id);
    }
}
