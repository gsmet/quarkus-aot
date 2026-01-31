package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service642.model.Model642;
import java.util.Optional;

public interface Entity642DatasourcePort {
    Optional<Model642> find(Long id);
}
