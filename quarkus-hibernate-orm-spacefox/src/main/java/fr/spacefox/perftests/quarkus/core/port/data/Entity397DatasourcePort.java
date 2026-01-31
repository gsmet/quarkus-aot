package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service397.model.Model397;
import java.util.Optional;

public interface Entity397DatasourcePort {
    Optional<Model397> find(Long id);
}
