package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service722.model.Model722;
import java.util.Optional;

public interface Entity722DatasourcePort {
    Optional<Model722> find(Long id);
}
