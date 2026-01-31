package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service245.model.Model245;
import java.util.Optional;

public interface Entity245DatasourcePort {
    Optional<Model245> find(Long id);
}
