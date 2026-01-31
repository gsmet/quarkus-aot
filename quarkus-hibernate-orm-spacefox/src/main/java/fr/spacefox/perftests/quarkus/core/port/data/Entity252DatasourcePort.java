package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service252.model.Model252;
import java.util.Optional;

public interface Entity252DatasourcePort {
    Optional<Model252> find(Long id);
}
