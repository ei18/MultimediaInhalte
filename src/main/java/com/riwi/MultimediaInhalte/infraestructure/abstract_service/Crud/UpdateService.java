package com.riwi.MultimediaInhalte.infraestructure.abstract_service.Crud;

public interface UpdateService<Request, Response, Id> {
    Response update(Request request, Id id);
}
