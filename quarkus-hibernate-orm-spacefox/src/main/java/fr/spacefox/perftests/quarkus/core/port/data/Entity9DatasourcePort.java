package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service9.model.Model9;
import java.util.Optional;

public interface Entity9DatasourcePort {
    Optional<Model9> find(Long id);
}
