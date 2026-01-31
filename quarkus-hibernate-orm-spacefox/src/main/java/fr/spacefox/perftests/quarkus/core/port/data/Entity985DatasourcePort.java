package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service985.model.Model985;
import java.util.Optional;

public interface Entity985DatasourcePort {
    Optional<Model985> find(Long id);
}
