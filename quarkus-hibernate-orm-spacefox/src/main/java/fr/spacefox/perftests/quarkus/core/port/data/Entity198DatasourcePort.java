package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service198.model.Model198;
import java.util.Optional;

public interface Entity198DatasourcePort {
    Optional<Model198> find(Long id);
}
