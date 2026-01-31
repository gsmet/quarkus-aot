package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service811.model.Model811;
import java.util.Optional;

public interface Entity811DatasourcePort {
    Optional<Model811> find(Long id);
}
