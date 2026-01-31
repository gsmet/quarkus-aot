package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service799.model.Model799;
import java.util.Optional;

public interface Entity799DatasourcePort {
    Optional<Model799> find(Long id);
}
