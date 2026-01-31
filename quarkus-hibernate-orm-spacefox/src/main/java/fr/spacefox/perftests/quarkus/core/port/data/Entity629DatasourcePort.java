package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service629.model.Model629;
import java.util.Optional;

public interface Entity629DatasourcePort {
    Optional<Model629> find(Long id);
}
