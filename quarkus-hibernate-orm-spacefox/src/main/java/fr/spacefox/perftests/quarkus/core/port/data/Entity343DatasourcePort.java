package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service343.model.Model343;
import java.util.Optional;

public interface Entity343DatasourcePort {
    Optional<Model343> find(Long id);
}
