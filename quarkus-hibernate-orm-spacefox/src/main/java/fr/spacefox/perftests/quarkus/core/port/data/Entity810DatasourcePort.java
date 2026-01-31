package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service810.model.Model810;
import java.util.Optional;

public interface Entity810DatasourcePort {
    Optional<Model810> find(Long id);
}
