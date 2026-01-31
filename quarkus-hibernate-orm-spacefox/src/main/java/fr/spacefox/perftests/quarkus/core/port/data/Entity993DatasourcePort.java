package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service993.model.Model993;
import java.util.Optional;

public interface Entity993DatasourcePort {
    Optional<Model993> find(Long id);
}
