package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service162.model.Model162;
import java.util.Optional;

public interface Entity162DatasourcePort {
    Optional<Model162> find(Long id);
}
