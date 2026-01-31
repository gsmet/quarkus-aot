package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service362.model.Model362;
import java.util.Optional;

public interface Entity362DatasourcePort {
    Optional<Model362> find(Long id);
}
