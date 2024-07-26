package com.riwi.MultimediaInhalte.infraestructure.abstract_service;

import com.riwi.MultimediaInhalte.api.dto.request.ClassRequest;
import com.riwi.MultimediaInhalte.api.dto.response.ClassResponse;
import com.riwi.MultimediaInhalte.infraestructure.abstract_service.Crud.CreateService;
import com.riwi.MultimediaInhalte.infraestructure.abstract_service.Crud.ReadAllService;
import com.riwi.MultimediaInhalte.infraestructure.abstract_service.Crud.ReadService;

public interface IClassService extends 
                 CreateService<ClassRequest, ClassResponse>,
                 ReadService<ClassResponse, Long>,
                 ReadAllService<ClassResponse>{
    
}
