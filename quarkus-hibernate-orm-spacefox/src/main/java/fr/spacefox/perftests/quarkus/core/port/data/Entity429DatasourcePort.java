package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service429.model.Model429;
import java.util.Optional;

public interface Entity429DatasourcePort {
    Optional<Model429> find(Long id);
}
