package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service56.model.Model56;
import java.util.Optional;

public interface Entity56DatasourcePort {
    Optional<Model56> find(Long id);
}
