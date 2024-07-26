package com.riwi.MultimediaInhalte.infraestructure.abstract_service.Crud;

public interface ReadService<Response, Id> {
    Response get(Id id);
}
