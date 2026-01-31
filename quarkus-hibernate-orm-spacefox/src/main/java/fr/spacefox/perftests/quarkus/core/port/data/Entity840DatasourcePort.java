package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service840.model.Model840;
import java.util.Optional;

public interface Entity840DatasourcePort {
    Optional<Model840> find(Long id);
}
