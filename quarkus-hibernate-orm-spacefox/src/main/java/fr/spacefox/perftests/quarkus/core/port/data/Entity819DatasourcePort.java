package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service819.model.Model819;
import java.util.Optional;

public interface Entity819DatasourcePort {
    Optional<Model819> find(Long id);
}
