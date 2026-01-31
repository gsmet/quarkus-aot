package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service760.model.Model760;
import java.util.Optional;

public interface Entity760DatasourcePort {
    Optional<Model760> find(Long id);
}
