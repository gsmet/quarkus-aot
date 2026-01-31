package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service717.model.Model717;
import java.util.Optional;

public interface Entity717DatasourcePort {
    Optional<Model717> find(Long id);
}
