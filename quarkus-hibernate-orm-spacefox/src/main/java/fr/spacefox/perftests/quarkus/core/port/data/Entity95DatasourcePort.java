package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service95.model.Model95;
import java.util.Optional;

public interface Entity95DatasourcePort {
    Optional<Model95> find(Long id);
}
