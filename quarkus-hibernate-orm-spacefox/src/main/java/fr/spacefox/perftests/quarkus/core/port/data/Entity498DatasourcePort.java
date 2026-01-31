package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service498.model.Model498;
import java.util.Optional;

public interface Entity498DatasourcePort {
    Optional<Model498> find(Long id);
}
