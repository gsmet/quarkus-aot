package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service191.model.Model191;
import java.util.Optional;

public interface Entity191DatasourcePort {
    Optional<Model191> find(Long id);
}
