package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service663.model.Model663;
import java.util.Optional;

public interface Entity663DatasourcePort {
    Optional<Model663> find(Long id);
}
