package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service53.model.Model53;
import java.util.Optional;

public interface Entity53DatasourcePort {
    Optional<Model53> find(Long id);
}
