package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service864.model.Model864;
import java.util.Optional;

public interface Entity864DatasourcePort {
    Optional<Model864> find(Long id);
}
