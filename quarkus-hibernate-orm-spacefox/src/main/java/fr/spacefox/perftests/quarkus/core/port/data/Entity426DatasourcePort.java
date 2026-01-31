package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service426.model.Model426;
import java.util.Optional;

public interface Entity426DatasourcePort {
    Optional<Model426> find(Long id);
}
