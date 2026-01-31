package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service731.model.Model731;
import java.util.Optional;

public interface Entity731DatasourcePort {
    Optional<Model731> find(Long id);
}
