package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service159.model.Model159;
import java.util.Optional;

public interface Entity159DatasourcePort {
    Optional<Model159> find(Long id);
}
