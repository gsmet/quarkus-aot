package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service868.model.Model868;
import java.util.Optional;

public interface Entity868DatasourcePort {
    Optional<Model868> find(Long id);
}
