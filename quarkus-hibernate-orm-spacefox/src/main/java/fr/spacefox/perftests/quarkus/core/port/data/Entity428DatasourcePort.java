package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service428.model.Model428;
import java.util.Optional;

public interface Entity428DatasourcePort {
    Optional<Model428> find(Long id);
}
