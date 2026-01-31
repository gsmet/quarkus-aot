package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service12.model.Model12;
import java.util.Optional;

public interface Entity12DatasourcePort {
    Optional<Model12> find(Long id);
}
