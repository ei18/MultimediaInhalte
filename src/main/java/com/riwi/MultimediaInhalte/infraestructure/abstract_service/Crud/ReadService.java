package com.riwi.MultimediaInhalte.infraestructure.abstract_service.Crud;

import java.util.Optional;

public interface ReadService<Response, Id> {
    Optional<Response> get(Id id);
}
