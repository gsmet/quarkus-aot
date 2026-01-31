package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service298.model.Model298;
import java.util.Optional;

public interface Entity298DatasourcePort {
    Optional<Model298> find(Long id);
}
