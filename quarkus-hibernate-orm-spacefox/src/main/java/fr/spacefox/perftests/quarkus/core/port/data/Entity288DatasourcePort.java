package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service288.model.Model288;
import java.util.Optional;

public interface Entity288DatasourcePort {
    Optional<Model288> find(Long id);
}
