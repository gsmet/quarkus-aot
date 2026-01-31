package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service281.model.Model281;
import java.util.Optional;

public interface Entity281DatasourcePort {
    Optional<Model281> find(Long id);
}
