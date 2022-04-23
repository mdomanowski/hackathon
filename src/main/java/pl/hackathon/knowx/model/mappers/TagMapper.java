package pl.hackathon.knowx.model.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import pl.hackathon.knowx.model.dtos.TagDto;
import pl.hackathon.knowx.model.entities.Tag;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TagMapper {
    TagMapper INSTANCE = Mappers.getMapper(TagMapper.class);

    Tag tagDtoToTag(TagDto tagDto);
    TagDto tagToTagDto(Tag tag);
    List<Tag> tagListDtoToTagList(List<TagDto> tagsDto);
    List<TagDto> tagListToTagListDto(List<Tag> tags);
}
