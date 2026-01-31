package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service167.model.Model167;
import java.util.Optional;

public interface Entity167DatasourcePort {
    Optional<Model167> find(Long id);
}
