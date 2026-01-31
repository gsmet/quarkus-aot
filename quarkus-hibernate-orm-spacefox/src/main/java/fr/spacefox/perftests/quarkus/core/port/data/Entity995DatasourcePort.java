package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service995.model.Model995;
import java.util.Optional;

public interface Entity995DatasourcePort {
    Optional<Model995> find(Long id);
}
