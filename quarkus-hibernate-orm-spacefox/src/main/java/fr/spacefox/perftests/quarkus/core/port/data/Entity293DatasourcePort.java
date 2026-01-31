package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service293.model.Model293;
import java.util.Optional;

public interface Entity293DatasourcePort {
    Optional<Model293> find(Long id);
}
