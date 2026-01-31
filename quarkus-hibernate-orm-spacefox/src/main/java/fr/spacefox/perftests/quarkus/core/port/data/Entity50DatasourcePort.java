package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service50.model.Model50;
import java.util.Optional;

public interface Entity50DatasourcePort {
    Optional<Model50> find(Long id);
}
