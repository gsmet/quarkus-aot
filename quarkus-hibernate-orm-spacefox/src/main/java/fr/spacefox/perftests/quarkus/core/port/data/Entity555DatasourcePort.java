package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service555.model.Model555;
import java.util.Optional;

public interface Entity555DatasourcePort {
    Optional<Model555> find(Long id);
}
