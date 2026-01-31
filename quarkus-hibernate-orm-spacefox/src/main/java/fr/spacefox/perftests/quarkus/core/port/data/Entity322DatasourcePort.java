package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service322.model.Model322;
import java.util.Optional;

public interface Entity322DatasourcePort {
    Optional<Model322> find(Long id);
}
