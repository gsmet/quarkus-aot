package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service199.model.Model199;
import java.util.Optional;

public interface Entity199DatasourcePort {
    Optional<Model199> find(Long id);
}
