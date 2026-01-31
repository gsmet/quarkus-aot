package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service631.model.Model631;
import java.util.Optional;

public interface Entity631DatasourcePort {
    Optional<Model631> find(Long id);
}
