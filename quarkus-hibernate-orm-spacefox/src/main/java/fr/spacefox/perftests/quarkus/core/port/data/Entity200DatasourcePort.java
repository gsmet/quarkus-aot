package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service200.model.Model200;
import java.util.Optional;

public interface Entity200DatasourcePort {
    Optional<Model200> find(Long id);
}
