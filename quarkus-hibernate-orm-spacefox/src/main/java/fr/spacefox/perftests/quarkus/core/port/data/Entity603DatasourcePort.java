package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service603.model.Model603;
import java.util.Optional;

public interface Entity603DatasourcePort {
    Optional<Model603> find(Long id);
}
