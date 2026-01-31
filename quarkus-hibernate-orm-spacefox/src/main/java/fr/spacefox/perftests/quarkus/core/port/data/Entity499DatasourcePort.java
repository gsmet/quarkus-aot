package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service499.model.Model499;
import java.util.Optional;

public interface Entity499DatasourcePort {
    Optional<Model499> find(Long id);
}
