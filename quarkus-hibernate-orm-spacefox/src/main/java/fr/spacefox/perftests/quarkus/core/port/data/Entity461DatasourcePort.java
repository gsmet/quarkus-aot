package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service461.model.Model461;
import java.util.Optional;

public interface Entity461DatasourcePort {
    Optional<Model461> find(Long id);
}
