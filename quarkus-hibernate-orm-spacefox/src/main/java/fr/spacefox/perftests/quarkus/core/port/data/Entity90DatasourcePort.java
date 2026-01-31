package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service90.model.Model90;
import java.util.Optional;

public interface Entity90DatasourcePort {
    Optional<Model90> find(Long id);
}
