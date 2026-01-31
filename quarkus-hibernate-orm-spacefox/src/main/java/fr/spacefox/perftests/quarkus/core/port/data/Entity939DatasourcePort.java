package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service939.model.Model939;
import java.util.Optional;

public interface Entity939DatasourcePort {
    Optional<Model939> find(Long id);
}
