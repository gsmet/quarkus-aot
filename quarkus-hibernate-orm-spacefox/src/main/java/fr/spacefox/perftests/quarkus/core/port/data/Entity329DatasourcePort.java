package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service329.model.Model329;
import java.util.Optional;

public interface Entity329DatasourcePort {
    Optional<Model329> find(Long id);
}
