package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service578.model.Model578;
import java.util.Optional;

public interface Entity578DatasourcePort {
    Optional<Model578> find(Long id);
}
