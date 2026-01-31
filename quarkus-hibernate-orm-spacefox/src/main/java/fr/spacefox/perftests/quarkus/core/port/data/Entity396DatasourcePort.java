package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service396.model.Model396;
import java.util.Optional;

public interface Entity396DatasourcePort {
    Optional<Model396> find(Long id);
}
