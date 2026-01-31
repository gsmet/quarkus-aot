package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service564.model.Model564;
import java.util.Optional;

public interface Entity564DatasourcePort {
    Optional<Model564> find(Long id);
}
