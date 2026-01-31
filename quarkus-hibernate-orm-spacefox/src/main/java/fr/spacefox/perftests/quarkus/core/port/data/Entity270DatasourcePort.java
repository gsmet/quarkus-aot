package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service270.model.Model270;
import java.util.Optional;

public interface Entity270DatasourcePort {
    Optional<Model270> find(Long id);
}
