package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service328.model.Model328;
import java.util.Optional;

public interface Entity328DatasourcePort {
    Optional<Model328> find(Long id);
}
