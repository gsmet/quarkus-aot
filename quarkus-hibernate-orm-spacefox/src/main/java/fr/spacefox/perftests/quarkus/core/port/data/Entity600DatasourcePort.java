package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service600.model.Model600;
import java.util.Optional;

public interface Entity600DatasourcePort {
    Optional<Model600> find(Long id);
}
