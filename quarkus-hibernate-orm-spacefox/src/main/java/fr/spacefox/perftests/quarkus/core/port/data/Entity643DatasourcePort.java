package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service643.model.Model643;
import java.util.Optional;

public interface Entity643DatasourcePort {
    Optional<Model643> find(Long id);
}
