package local.dplabs.notetaker.note;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class NoteServiceImplemtor implements NoteService {

    @Autowired
    private NoteRepository noteRepository;

    @Override
    public Note saveNote(Note aNote) {
        return noteRepository.save(aNote);
    }
}
