package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service569.model.Model569;
import java.util.Optional;

public interface Entity569DatasourcePort {
    Optional<Model569> find(Long id);
}
