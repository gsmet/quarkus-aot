package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service104.model.Model104;
import java.util.Optional;

public interface Entity104DatasourcePort {
    Optional<Model104> find(Long id);
}
