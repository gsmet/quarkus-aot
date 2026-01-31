package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service259.model.Model259;
import java.util.Optional;

public interface Entity259DatasourcePort {
    Optional<Model259> find(Long id);
}
