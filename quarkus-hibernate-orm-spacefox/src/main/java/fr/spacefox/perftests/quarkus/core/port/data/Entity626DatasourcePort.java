package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service626.model.Model626;
import java.util.Optional;

public interface Entity626DatasourcePort {
    Optional<Model626> find(Long id);
}
