package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service47.model.Model47;
import java.util.Optional;

public interface Entity47DatasourcePort {
    Optional<Model47> find(Long id);
}
