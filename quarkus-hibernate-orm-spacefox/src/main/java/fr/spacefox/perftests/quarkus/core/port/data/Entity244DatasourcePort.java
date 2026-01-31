package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service244.model.Model244;
import java.util.Optional;

public interface Entity244DatasourcePort {
    Optional<Model244> find(Long id);
}
