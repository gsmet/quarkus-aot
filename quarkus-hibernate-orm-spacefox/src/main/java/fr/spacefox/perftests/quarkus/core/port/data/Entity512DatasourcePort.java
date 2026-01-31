package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service512.model.Model512;
import java.util.Optional;

public interface Entity512DatasourcePort {
    Optional<Model512> find(Long id);
}
