package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service233.model.Model233;
import java.util.Optional;

public interface Entity233DatasourcePort {
    Optional<Model233> find(Long id);
}
