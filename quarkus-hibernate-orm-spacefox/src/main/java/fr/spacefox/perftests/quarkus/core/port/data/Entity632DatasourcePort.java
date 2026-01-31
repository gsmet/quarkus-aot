package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service632.model.Model632;
import java.util.Optional;

public interface Entity632DatasourcePort {
    Optional<Model632> find(Long id);
}
