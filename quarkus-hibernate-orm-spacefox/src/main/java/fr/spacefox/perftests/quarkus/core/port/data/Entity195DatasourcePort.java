package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service195.model.Model195;
import java.util.Optional;

public interface Entity195DatasourcePort {
    Optional<Model195> find(Long id);
}
