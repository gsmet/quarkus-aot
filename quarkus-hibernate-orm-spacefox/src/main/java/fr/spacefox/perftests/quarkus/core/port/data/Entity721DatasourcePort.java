package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service721.model.Model721;
import java.util.Optional;

public interface Entity721DatasourcePort {
    Optional<Model721> find(Long id);
}
