package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service672.model.Model672;
import java.util.Optional;

public interface Entity672DatasourcePort {
    Optional<Model672> find(Long id);
}
