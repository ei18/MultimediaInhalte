package com.riwi.MultimediaInhalte.infraestructure.abstract_service.Crud;

public interface CreateService<Request, Response> {
    Response create(Request request);
}
