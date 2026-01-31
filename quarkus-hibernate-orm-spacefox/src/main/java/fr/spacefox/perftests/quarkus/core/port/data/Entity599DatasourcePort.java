package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service599.model.Model599;
import java.util.Optional;

public interface Entity599DatasourcePort {
    Optional<Model599> find(Long id);
}
