package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service752.model.Model752;
import java.util.Optional;

public interface Entity752DatasourcePort {
    Optional<Model752> find(Long id);
}
