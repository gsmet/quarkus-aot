package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service559.model.Model559;
import java.util.Optional;

public interface Entity559DatasourcePort {
    Optional<Model559> find(Long id);
}
