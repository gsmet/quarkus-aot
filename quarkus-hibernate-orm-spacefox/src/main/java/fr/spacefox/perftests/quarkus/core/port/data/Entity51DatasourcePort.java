package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service51.model.Model51;
import java.util.Optional;

public interface Entity51DatasourcePort {
    Optional<Model51> find(Long id);
}
