package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service640.model.Model640;
import java.util.Optional;

public interface Entity640DatasourcePort {
    Optional<Model640> find(Long id);
}
