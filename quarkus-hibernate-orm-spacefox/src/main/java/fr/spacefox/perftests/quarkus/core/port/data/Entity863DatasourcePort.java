package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service863.model.Model863;
import java.util.Optional;

public interface Entity863DatasourcePort {
    Optional<Model863> find(Long id);
}
