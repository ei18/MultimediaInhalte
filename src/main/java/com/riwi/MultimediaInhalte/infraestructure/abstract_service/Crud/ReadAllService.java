package com.riwi.MultimediaInhalte.infraestructure.abstract_service.Crud;

import org.springframework.data.domain.Page;

public interface ReadAllService<Response> {
    Page<Response> getAll(int page, int size);
}
