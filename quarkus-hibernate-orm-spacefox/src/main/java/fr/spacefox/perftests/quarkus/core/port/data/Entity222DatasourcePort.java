package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service222.model.Model222;
import java.util.Optional;

public interface Entity222DatasourcePort {
    Optional<Model222> find(Long id);
}
