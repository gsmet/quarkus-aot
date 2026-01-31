package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service710.model.Model710;
import java.util.Optional;

public interface Entity710DatasourcePort {
    Optional<Model710> find(Long id);
}
