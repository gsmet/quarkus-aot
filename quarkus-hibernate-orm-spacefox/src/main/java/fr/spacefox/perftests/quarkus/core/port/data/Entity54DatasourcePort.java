package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service54.model.Model54;
import java.util.Optional;

public interface Entity54DatasourcePort {
    Optional<Model54> find(Long id);
}
