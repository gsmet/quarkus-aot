package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service775.model.Model775;
import java.util.Optional;

public interface Entity775DatasourcePort {
    Optional<Model775> find(Long id);
}
