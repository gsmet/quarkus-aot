package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service708.model.Model708;
import java.util.Optional;

public interface Entity708DatasourcePort {
    Optional<Model708> find(Long id);
}
