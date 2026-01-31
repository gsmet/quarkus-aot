package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service605.model.Model605;
import java.util.Optional;

public interface Entity605DatasourcePort {
    Optional<Model605> find(Long id);
}
