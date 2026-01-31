package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service212.model.Model212;
import java.util.Optional;

public interface Entity212DatasourcePort {
    Optional<Model212> find(Long id);
}
