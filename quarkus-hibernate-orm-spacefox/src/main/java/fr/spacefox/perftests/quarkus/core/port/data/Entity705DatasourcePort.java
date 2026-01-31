package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service705.model.Model705;
import java.util.Optional;

public interface Entity705DatasourcePort {
    Optional<Model705> find(Long id);
}
