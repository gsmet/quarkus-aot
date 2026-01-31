package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service40.model.Model40;
import java.util.Optional;

public interface Entity40DatasourcePort {
    Optional<Model40> find(Long id);
}
