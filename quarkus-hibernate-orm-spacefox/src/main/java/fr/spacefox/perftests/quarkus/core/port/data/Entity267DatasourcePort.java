package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service267.model.Model267;
import java.util.Optional;

public interface Entity267DatasourcePort {
    Optional<Model267> find(Long id);
}
