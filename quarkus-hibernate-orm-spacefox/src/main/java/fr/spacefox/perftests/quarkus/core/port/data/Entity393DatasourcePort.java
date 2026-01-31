package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service393.model.Model393;
import java.util.Optional;

public interface Entity393DatasourcePort {
    Optional<Model393> find(Long id);
}
