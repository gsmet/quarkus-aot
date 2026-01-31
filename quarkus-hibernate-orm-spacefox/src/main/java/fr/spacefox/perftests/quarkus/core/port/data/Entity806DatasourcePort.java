package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service806.model.Model806;
import java.util.Optional;

public interface Entity806DatasourcePort {
    Optional<Model806> find(Long id);
}
