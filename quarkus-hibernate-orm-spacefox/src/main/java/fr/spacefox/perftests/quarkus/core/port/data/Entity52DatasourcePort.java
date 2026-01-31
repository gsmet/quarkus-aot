package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service52.model.Model52;
import java.util.Optional;

public interface Entity52DatasourcePort {
    Optional<Model52> find(Long id);
}
