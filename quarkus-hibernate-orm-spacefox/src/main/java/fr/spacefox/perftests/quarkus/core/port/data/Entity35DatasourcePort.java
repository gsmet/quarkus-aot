package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service35.model.Model35;
import java.util.Optional;

public interface Entity35DatasourcePort {
    Optional<Model35> find(Long id);
}
