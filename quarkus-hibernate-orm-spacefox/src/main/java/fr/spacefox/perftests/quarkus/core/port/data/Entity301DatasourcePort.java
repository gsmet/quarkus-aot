package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service301.model.Model301;
import java.util.Optional;

public interface Entity301DatasourcePort {
    Optional<Model301> find(Long id);
}
