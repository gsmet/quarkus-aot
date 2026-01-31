package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service275.model.Model275;
import java.util.Optional;

public interface Entity275DatasourcePort {
    Optional<Model275> find(Long id);
}
