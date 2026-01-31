package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service98.model.Model98;
import java.util.Optional;

public interface Entity98DatasourcePort {
    Optional<Model98> find(Long id);
}
