package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service65.model.Model65;
import java.util.Optional;

public interface Entity65DatasourcePort {
    Optional<Model65> find(Long id);
}
