package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service567.model.Model567;
import java.util.Optional;

public interface Entity567DatasourcePort {
    Optional<Model567> find(Long id);
}
