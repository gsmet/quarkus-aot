package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service448.model.Model448;
import java.util.Optional;

public interface Entity448DatasourcePort {
    Optional<Model448> find(Long id);
}
