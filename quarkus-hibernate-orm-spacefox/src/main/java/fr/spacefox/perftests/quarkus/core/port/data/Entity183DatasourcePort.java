package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service183.model.Model183;
import java.util.Optional;

public interface Entity183DatasourcePort {
    Optional<Model183> find(Long id);
}
