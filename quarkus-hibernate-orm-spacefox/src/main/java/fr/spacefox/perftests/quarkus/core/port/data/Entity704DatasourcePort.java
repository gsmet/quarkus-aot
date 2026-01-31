package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service704.model.Model704;
import java.util.Optional;

public interface Entity704DatasourcePort {
    Optional<Model704> find(Long id);
}
