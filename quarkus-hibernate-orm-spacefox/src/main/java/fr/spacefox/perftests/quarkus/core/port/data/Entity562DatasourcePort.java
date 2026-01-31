package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service562.model.Model562;
import java.util.Optional;

public interface Entity562DatasourcePort {
    Optional<Model562> find(Long id);
}
