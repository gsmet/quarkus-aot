package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service519.model.Model519;
import java.util.Optional;

public interface Entity519DatasourcePort {
    Optional<Model519> find(Long id);
}
