package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service142.model.Model142;
import java.util.Optional;

public interface Entity142DatasourcePort {
    Optional<Model142> find(Long id);
}
