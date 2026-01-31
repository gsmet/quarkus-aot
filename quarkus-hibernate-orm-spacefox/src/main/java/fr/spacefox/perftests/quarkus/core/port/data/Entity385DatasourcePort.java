package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service385.model.Model385;
import java.util.Optional;

public interface Entity385DatasourcePort {
    Optional<Model385> find(Long id);
}
