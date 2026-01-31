package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service357.model.Model357;
import java.util.Optional;

public interface Entity357DatasourcePort {
    Optional<Model357> find(Long id);
}
