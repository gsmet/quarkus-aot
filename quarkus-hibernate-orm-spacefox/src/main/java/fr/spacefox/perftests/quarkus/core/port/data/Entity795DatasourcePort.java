package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service795.model.Model795;
import java.util.Optional;

public interface Entity795DatasourcePort {
    Optional<Model795> find(Long id);
}
