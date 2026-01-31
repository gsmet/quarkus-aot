package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service478.model.Model478;
import java.util.Optional;

public interface Entity478DatasourcePort {
    Optional<Model478> find(Long id);
}
