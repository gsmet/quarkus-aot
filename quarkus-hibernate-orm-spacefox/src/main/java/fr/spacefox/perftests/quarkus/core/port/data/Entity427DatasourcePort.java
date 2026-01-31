package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service427.model.Model427;
import java.util.Optional;

public interface Entity427DatasourcePort {
    Optional<Model427> find(Long id);
}
