package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service774.model.Model774;
import java.util.Optional;

public interface Entity774DatasourcePort {
    Optional<Model774> find(Long id);
}
