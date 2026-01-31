package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service364.model.Model364;
import java.util.Optional;

public interface Entity364DatasourcePort {
    Optional<Model364> find(Long id);
}
