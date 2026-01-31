package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service424.model.Model424;
import java.util.Optional;

public interface Entity424DatasourcePort {
    Optional<Model424> find(Long id);
}
