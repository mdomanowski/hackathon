package pl.hackathon.knowx.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.hackathon.knowx.model.dtos.TagDto;
import pl.hackathon.knowx.model.entities.Tag;
import pl.hackathon.knowx.model.mappers.TagMapper;
import pl.hackathon.knowx.model.repositories.TagRepository;

import java.util.Optional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TagService {
    private final TagRepository tagRepository;

    public Tag createTag(TagDto tagDto) {
        return tagRepository.save(TagMapper.INSTANCE.tagDtoToTag(tagDto));
    }

    public Optional<Tag> getTag(Long id) {
        return tagRepository.findById(id);
    }

    public Optional<List<Tag>> getAllTags(){
        return Optional.of(tagRepository.findAll());
    }

    public void deleteTag(Long id) {
        tagRepository.deleteById(id);
    }
}
