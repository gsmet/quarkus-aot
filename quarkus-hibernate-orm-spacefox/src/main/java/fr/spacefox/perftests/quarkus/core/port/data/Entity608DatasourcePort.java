package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service608.model.Model608;
import java.util.Optional;

public interface Entity608DatasourcePort {
    Optional<Model608> find(Long id);
}
