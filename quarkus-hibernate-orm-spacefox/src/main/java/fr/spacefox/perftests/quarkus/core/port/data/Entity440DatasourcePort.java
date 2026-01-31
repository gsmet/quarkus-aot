package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service440.model.Model440;
import java.util.Optional;

public interface Entity440DatasourcePort {
    Optional<Model440> find(Long id);
}
