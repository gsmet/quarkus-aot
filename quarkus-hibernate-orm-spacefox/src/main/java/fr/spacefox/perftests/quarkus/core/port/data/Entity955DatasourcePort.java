package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service955.model.Model955;
import java.util.Optional;

public interface Entity955DatasourcePort {
    Optional<Model955> find(Long id);
}
