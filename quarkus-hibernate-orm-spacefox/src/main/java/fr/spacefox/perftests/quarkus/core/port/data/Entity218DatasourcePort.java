package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service218.model.Model218;
import java.util.Optional;

public interface Entity218DatasourcePort {
    Optional<Model218> find(Long id);
}
