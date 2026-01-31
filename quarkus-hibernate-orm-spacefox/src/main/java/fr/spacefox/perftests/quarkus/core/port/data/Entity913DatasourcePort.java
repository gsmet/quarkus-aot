package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service913.model.Model913;
import java.util.Optional;

public interface Entity913DatasourcePort {
    Optional<Model913> find(Long id);
}
