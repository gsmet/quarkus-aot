package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service465.model.Model465;
import java.util.Optional;

public interface Entity465DatasourcePort {
    Optional<Model465> find(Long id);
}
