package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service46.model.Model46;
import java.util.Optional;

public interface Entity46DatasourcePort {
    Optional<Model46> find(Long id);
}
