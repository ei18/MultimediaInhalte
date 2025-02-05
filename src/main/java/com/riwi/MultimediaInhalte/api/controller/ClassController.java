package com.riwi.MultimediaInhalte.api.controller;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.ErrorResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.MultimediaInhalte.api.dto.request.ClassRequest;
import com.riwi.MultimediaInhalte.api.dto.response.ClassResponse;
import com.riwi.MultimediaInhalte.infraestructure.abstract_service.IClassService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping(path = "/class1")
@AllArgsConstructor
@Tag(name = "Class")
public class ClassController {
    private final IClassService classService;

    @ApiResponse(responseCode = "400", description = "When the id is invalid", content = {
    @Content(mediaType = "application/json", schema = @Schema(implementation = ErrorResponse.class))})
    @Operation(
        summary = "List a class by id",
        description = "You must send the id of the class to search for")  
    @GetMapping(path = "/{id}")
    public ResponseEntity<Optional<ClassResponse>> get(@PathVariable Long id){
        return ResponseEntity.ok(this.classService.get(id));
    }

    
    @Operation(
        summary = "List all class with pagination",
        description = "You must submit the page and the page size to get all the corresponding class")
    @GetMapping
    public ResponseEntity<Page<ClassResponse>> getAll(
            @RequestParam(defaultValue = "1") Integer page,
            @RequestParam(defaultValue = "10") Integer size){
        return  ResponseEntity.ok(this.classService.getAll(page -1, size));
    }

    @Operation(
        summary = "Create a class",
        description = "Create a class")  
    @PostMapping
    public ResponseEntity<ClassResponse> create(@Validated @RequestBody ClassRequest request){
        return ResponseEntity.ok(this.classService.create(request));
    }
}
