package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service745.model.Model745;
import java.util.Optional;

public interface Entity745DatasourcePort {
    Optional<Model745> find(Long id);
}
