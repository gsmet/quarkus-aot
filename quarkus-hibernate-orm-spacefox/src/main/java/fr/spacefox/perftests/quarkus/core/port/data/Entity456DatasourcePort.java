package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service456.model.Model456;
import java.util.Optional;

public interface Entity456DatasourcePort {
    Optional<Model456> find(Long id);
}
