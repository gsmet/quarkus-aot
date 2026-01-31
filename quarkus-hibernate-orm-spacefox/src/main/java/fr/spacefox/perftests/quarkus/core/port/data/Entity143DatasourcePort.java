package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service143.model.Model143;
import java.util.Optional;

public interface Entity143DatasourcePort {
    Optional<Model143> find(Long id);
}
