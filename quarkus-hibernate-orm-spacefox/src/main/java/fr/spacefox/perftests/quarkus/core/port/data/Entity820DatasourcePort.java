package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service820.model.Model820;
import java.util.Optional;

public interface Entity820DatasourcePort {
    Optional<Model820> find(Long id);
}
