package fr.spacefox.perftests.quarkus.core.port.data;

import fr.spacefox.perftests.quarkus.core.service550.model.Model550;
import java.util.Optional;

public interface Entity550DatasourcePort {
    Optional<Model550> find(Long id);
}
