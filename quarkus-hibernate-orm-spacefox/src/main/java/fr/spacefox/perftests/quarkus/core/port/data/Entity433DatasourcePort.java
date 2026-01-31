package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service433.model.Model433;
import java.util.Optional;

public interface Entity433DatasourcePort {
    Optional<Model433> find(Long id);
}
