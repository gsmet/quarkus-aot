package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service323.model.Model323;
import java.util.Optional;

public interface Entity323DatasourcePort {
    Optional<Model323> find(Long id);
}
