package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service123.model.Model123;
import java.util.Optional;

public interface Entity123DatasourcePort {
    Optional<Model123> find(Long id);
}
