package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service45.model.Model45;
import java.util.Optional;

public interface Entity45DatasourcePort {
    Optional<Model45> find(Long id);
}
