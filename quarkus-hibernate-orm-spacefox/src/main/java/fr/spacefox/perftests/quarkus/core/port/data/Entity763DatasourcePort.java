package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service763.model.Model763;
import java.util.Optional;

public interface Entity763DatasourcePort {
    Optional<Model763> find(Long id);
}
