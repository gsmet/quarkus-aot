package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service893.model.Model893;
import java.util.Optional;

public interface Entity893DatasourcePort {
    Optional<Model893> find(Long id);
}
