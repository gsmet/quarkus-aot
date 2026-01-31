package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service986.model.Model986;
import java.util.Optional;

public interface Entity986DatasourcePort {
    Optional<Model986> find(Long id);
}
