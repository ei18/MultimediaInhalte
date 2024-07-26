package com.riwi.MultimediaInhalte.infraestructure.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.riwi.MultimediaInhalte.api.dto.request.ClassRequest;
import com.riwi.MultimediaInhalte.api.dto.response.ClassResponse;
import com.riwi.MultimediaInhalte.domain.entities.Class;
import com.riwi.MultimediaInhalte.domain.repositories.ClassRepository;
import com.riwi.MultimediaInhalte.infraestructure.abstract_service.IClassService;
import com.riwi.MultimediaInhalte.infraestructure.mappers.ClassMapper;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@Transactional
@AllArgsConstructor
public class ClassService implements IClassService{
    
    private final ClassRepository classRepository;

    private final ClassMapper classMapper;
    
    @Override
    public ClassResponse create(ClassRequest request) {
        Class class1 = classMapper.classRequestToClass(request);
        return classMapper.classToClassResponse(this.classRepository.save(class1));
    }

    @Override
    public ClassResponse get(Long id) {
        return null;
    }

    @Override
    public Page<ClassResponse> getAll(int page, int size) {
        if (page < 0)
            page = 0;
        PageRequest pagination = PageRequest.of(page, size);

        return this.classRepository.findAll(pagination).map(classMapper::classToClassResponse);
    }
    
}
