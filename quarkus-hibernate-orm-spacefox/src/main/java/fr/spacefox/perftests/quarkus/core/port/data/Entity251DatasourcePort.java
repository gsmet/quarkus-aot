package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service251.model.Model251;
import java.util.Optional;

public interface Entity251DatasourcePort {
    Optional<Model251> find(Long id);
}
