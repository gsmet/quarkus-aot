package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service607.model.Model607;
import java.util.Optional;

public interface Entity607DatasourcePort {
    Optional<Model607> find(Long id);
}
