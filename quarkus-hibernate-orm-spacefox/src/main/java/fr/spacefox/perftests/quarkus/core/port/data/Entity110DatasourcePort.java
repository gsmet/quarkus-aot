package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service110.model.Model110;
import java.util.Optional;

public interface Entity110DatasourcePort {
    Optional<Model110> find(Long id);
}
