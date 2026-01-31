package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service755.model.Model755;
import java.util.Optional;

public interface Entity755DatasourcePort {
    Optional<Model755> find(Long id);
}
