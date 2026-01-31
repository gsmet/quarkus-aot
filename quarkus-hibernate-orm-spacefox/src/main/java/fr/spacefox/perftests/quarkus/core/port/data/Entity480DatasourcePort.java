package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service480.model.Model480;
import java.util.Optional;

public interface Entity480DatasourcePort {
    Optional<Model480> find(Long id);
}
