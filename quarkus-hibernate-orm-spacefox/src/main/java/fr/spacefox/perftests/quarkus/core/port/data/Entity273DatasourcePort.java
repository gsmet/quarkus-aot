package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service273.model.Model273;
import java.util.Optional;

public interface Entity273DatasourcePort {
    Optional<Model273> find(Long id);
}
