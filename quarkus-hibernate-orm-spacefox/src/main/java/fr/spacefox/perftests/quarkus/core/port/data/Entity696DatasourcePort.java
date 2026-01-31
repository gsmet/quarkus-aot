package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service696.model.Model696;
import java.util.Optional;

public interface Entity696DatasourcePort {
    Optional<Model696> find(Long id);
}
