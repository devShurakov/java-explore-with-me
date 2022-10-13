package ru.practicum.app.compilation;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import java.util.List;

public interface CompilationService {
    List<CompilationDto> getCompilations(Boolean pinned, @Min(0) int from, @Min(1) int size);

    CompilationDto getCompilationById(Integer compId);

    CompilationDto addCompilation(@Valid NewCompilationDto newCompilationDto);

    void deleteCompilationById(Integer compId);

    void addEventToCompilation(Integer compId, Integer eventId);

    void deleteEventFromCompilation(Integer compId, Integer eventId);

    void pinCompilation(Integer compId);

    void unpinCompilation(Integer compId);

    Compilation findCompilationById(Integer compId);
}
