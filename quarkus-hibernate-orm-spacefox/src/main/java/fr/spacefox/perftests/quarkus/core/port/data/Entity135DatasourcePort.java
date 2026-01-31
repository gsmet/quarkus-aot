package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service135.model.Model135;
import java.util.Optional;

public interface Entity135DatasourcePort {
    Optional<Model135> find(Long id);
}
