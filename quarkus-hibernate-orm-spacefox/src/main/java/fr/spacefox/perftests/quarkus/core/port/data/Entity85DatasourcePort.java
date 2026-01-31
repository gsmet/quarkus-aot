package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service85.model.Model85;
import java.util.Optional;

public interface Entity85DatasourcePort {
    Optional<Model85> find(Long id);
}
