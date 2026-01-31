package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service82.model.Model82;
import java.util.Optional;

public interface Entity82DatasourcePort {
    Optional<Model82> find(Long id);
}
