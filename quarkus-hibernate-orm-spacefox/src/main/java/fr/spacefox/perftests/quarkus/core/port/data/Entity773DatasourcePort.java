package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service773.model.Model773;
import java.util.Optional;

public interface Entity773DatasourcePort {
    Optional<Model773> find(Long id);
}
