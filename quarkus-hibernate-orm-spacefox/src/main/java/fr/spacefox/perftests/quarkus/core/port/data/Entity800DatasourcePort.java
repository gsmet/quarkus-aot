package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service800.model.Model800;
import java.util.Optional;

public interface Entity800DatasourcePort {
    Optional<Model800> find(Long id);
}
