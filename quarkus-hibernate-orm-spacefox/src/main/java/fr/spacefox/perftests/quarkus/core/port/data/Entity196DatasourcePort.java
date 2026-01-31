package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service196.model.Model196;
import java.util.Optional;

public interface Entity196DatasourcePort {
    Optional<Model196> find(Long id);
}
