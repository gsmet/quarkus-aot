package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service238.model.Model238;
import java.util.Optional;

public interface Entity238DatasourcePort {
    Optional<Model238> find(Long id);
}
