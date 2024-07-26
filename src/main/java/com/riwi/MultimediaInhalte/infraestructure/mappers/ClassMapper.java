package com.riwi.MultimediaInhalte.infraestructure.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.riwi.MultimediaInhalte.api.dto.request.ClassRequest;
import com.riwi.MultimediaInhalte.api.dto.response.ClassResponse;
import com.riwi.MultimediaInhalte.domain.entities.Class;

@Mapper(componentModel = "spring")
public interface ClassMapper {
    
    @Mapping(target = "id", ignore = true)
    @Mapping(target = "students", ignore = true)
    @Mapping(target = "lessons", ignore = true)
    Class classRequestToClass(ClassRequest request);

    ClassResponse classToClassResponse(Class class1);
}
