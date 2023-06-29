package local.dplabs.notetaker.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.responses.*;
import io.swagger.v3.oas.annotations.*;
import io.swagger.v3.oas.annotations.media.*;


@RestController
@RequestMapping("/note")
@OpenAPIDefinition(info = @Info(title = "Notes management API",
description = "API for add/update/delete notes",
version = "2.0"
))
public class NoteController {

    @Autowired
    private NoteService noteService;


    @Operation(summary = "Create a note", description = "Create a note with details.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Note created"),
            @ApiResponse(responseCode = "500", description = "An error occured.") })

    @PostMapping("/add")
    public String add(@RequestBody Note aNote) {
        noteService.saveNote(aNote);
        return "A new 'note' is added.";
    }

}
