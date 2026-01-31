package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service972.model.Model972;
import java.util.Optional;

public interface Entity972DatasourcePort {
    Optional<Model972> find(Long id);
}
