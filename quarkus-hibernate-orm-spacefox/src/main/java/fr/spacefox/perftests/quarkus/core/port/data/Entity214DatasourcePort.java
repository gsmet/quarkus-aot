package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service214.model.Model214;
import java.util.Optional;

public interface Entity214DatasourcePort {
    Optional<Model214> find(Long id);
}
