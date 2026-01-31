package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service15.model.Model15;
import java.util.Optional;

public interface Entity15DatasourcePort {
    Optional<Model15> find(Long id);
}
