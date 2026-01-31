package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service400.model.Model400;
import java.util.Optional;

public interface Entity400DatasourcePort {
    Optional<Model400> find(Long id);
}
