package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service129.model.Model129;
import java.util.Optional;

public interface Entity129DatasourcePort {
    Optional<Model129> find(Long id);
}
