package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service948.model.Model948;
import java.util.Optional;

public interface Entity948DatasourcePort {
    Optional<Model948> find(Long id);
}
