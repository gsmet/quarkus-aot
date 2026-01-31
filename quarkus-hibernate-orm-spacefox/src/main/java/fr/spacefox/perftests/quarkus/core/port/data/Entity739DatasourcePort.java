package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service739.model.Model739;
import java.util.Optional;

public interface Entity739DatasourcePort {
    Optional<Model739> find(Long id);
}
