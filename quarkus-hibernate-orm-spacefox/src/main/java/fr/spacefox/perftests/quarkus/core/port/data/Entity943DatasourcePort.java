package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service943.model.Model943;
import java.util.Optional;

public interface Entity943DatasourcePort {
    Optional<Model943> find(Long id);
}
