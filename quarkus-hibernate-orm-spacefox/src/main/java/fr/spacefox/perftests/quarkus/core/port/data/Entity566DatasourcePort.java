package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service566.model.Model566;
import java.util.Optional;

public interface Entity566DatasourcePort {
    Optional<Model566> find(Long id);
}
