package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service996.model.Model996;
import java.util.Optional;

public interface Entity996DatasourcePort {
    Optional<Model996> find(Long id);
}
