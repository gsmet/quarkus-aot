package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service303.model.Model303;
import java.util.Optional;

public interface Entity303DatasourcePort {
    Optional<Model303> find(Long id);
}
